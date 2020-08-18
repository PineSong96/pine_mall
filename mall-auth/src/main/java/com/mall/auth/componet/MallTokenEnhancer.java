package com.mall.auth.componet;

import com.mall.auth.domain.MemberDetails;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import java.util.HashMap;
import java.util.Map;

/**
 * @vlog: My code, I understand
 * @desc: jwt自定义添加用户基本信息
 * @author: pine
 * @createDate: 2020/8/12
 * @version: 1.0
 */
public class MallTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        MemberDetails memberDetails = (MemberDetails) authentication.getPrincipal();

        final Map<String, Object> additionalInfo = new HashMap<>();

        final Map<String, Object> retMap = new HashMap<>();

        //todo 这里暴露memberId到Jwt的令牌中,后期可以根据自己的业务需要 进行添加字段
        additionalInfo.put("memberId", memberDetails.getUmsMember().getId());
        additionalInfo.put("nickName", memberDetails.getUmsMember().getNickname());
        additionalInfo.put("integration", memberDetails.getUmsMember().getIntegration());
        additionalInfo.put("warning", "&#35831;&#21247;&#38750;&#27861;&#25805;&#20316;&#65292;&#21542;&#21017;&#23558;&#25215;&#25285;&#30456;&#24212;&#27861;&#24459;&#36131;&#20219");

        retMap.put("additionalInfo", additionalInfo);

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(retMap);

        return accessToken;
    }
}
