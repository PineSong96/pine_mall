package com.mall.member.service;

import com.mall.common.api.CommonResult;
import com.mall.common.api.TokenInfo;
import com.mall.common.exception.BusinessException;
import com.mall.core.ums.entity.UmsMember;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 会员表
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-08-19 17:51:03
 */
public interface UmsMemberService {
    /**
     * 根据条件查询全部数据
     *
     * @param record
     * @return
     */
    List<UmsMember> getUmsMemberList(UmsMember record);

    /**
     * 根据条件分页查询
     *
     * @param record
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsMember> getUmsMemberByPage(UmsMember record, Integer pageSize, Integer pageNum);

    /**
     * 根据用户ID获取用户信息
     *
     * @param id
     * @return
     */
    UmsMember getUmsMemberById(Long id);

    /**
     * 根据条件筛选获取用户信息
     *
     * @param record
     * @return
     */
    UmsMember getUmsMember(UmsMember record);

    /**
     * 创建
     *
     * @param record
     * @return
     */
    int createUmsMember(UmsMember record);

    /**
     * 根据id删除
     *
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 更新信息
     *
     * @param record
     * @return
     */
    int updateUmsMember(UmsMember record);

    /**
     * 调用认证服务器进行登录获得token
     *
     * @param username
     * @param password
     * @return
     */
    TokenInfo login(String username, String password);

    /**
     * 刷新token
     * @param token
     * @return
     */
    String refreshToken(String token);

    /**
     * 用户注册
     */
    @Transactional
    CommonResult register(String username, String password, String telephone, String authCode);

    /**
     * 修改密码
     */
    @Transactional
    CommonResult updatePassword(String telephone, String password, String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();


    /**
     * @return
     *  otpCode
     */
    CommonResult generateAuthCode(String telPhone) throws BusinessException;

}

