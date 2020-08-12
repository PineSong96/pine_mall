package com.mall.auth.config;

import com.mall.auth.componet.MallTokenEnhancer;
import com.mall.auth.properties.JwtCAProperties;
import com.mall.auth.service.MallUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;


import javax.sql.DataSource;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Objects;

/**
 * @vlog: My code, I understand
 * @desc: 认证服务器配置
 * @author: pine
 * @createDate: 2020/8/12
 * @version: 1.0
 */
@Configuration
@EnableAuthorizationServer
@EnableConfigurationProperties(value = JwtCAProperties.class)
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private JwtCAProperties jwtCAProperties;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private MallUserDetailService mallUserDetailService;

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * token通过jwt存储
     *
     * @return
     */
    @Bean
    public TokenStore tokenStore() {
        return new JwtTokenStore(jwtAccessTokenConverter());
    }

    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        JwtAccessTokenConverter jwtAccessTokenConverter = new JwtAccessTokenConverter();
        //jwt 秘钥
        jwtAccessTokenConverter.setKeyPair(keyPair());
        Objects.isNull(jwtAccessTokenConverter.getAccessTokenConverter());
        return jwtAccessTokenConverter;
    }

    @Bean
    public KeyPair keyPair() {
        return new KeyStoreKeyFactory(new ClassPathResource(jwtCAProperties.getKeyPairName()), jwtCAProperties.getKeyPairSecret().toCharArray()).getKeyPair(jwtCAProperties.getKeyPairAlias(), jwtCAProperties.getKeyPairStoreSecret().toCharArray());
    }

    /**
     * 注入客户端配置，现在基于jdbc和内存中
     *
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.withClientDetails(clientDetails());
    }

    /**
     * 用于查找我们第三方客户端的组件 主要用于查找 数据库表 oauth_client_details
     */
    @Bean
    public ClientDetailsService clientDetails() {
        return new JdbcClientDetailsService(dataSource);
    }

    /**
     * 授权服务器的配置的配置
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {

        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(mallTokenEnhancer(), jwtAccessTokenConverter()));

        endpoints.tokenStore(tokenStore()) //授权服务器颁发的token 怎么存储的
                .tokenEnhancer(tokenEnhancerChain)
                .userDetailsService(mallUserDetailService) //用户来获取token的时候需要 进行账号密码
                .authenticationManager(authenticationManager);
    }

    /**
     * 自定义添加jwt信息
     * @return
     */
    @Bean
    public MallTokenEnhancer mallTokenEnhancer() {
        return new MallTokenEnhancer();
    }

    /**
     * 授权服务器安全配置
     */
    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        //第三方客户端校验token需要带入 clientId 和clientSecret来校验
        security.checkTokenAccess("isAuthenticated()")
                //来获取我们的tokenKey需要带入clientId,clientSecret
                .tokenKeyAccess("isAuthenticated()");
        security.allowFormAuthenticationForClients();
    }
}
