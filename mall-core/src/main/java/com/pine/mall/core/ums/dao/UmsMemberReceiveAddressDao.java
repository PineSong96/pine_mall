package com.pine.mall.core.ums.dao;

import java.util.List;

import com.pine.mall.core.ums.entity.UmsMemberReceiveAddress;

/**
 * 会员收货地址表
 *
 * @author Pine
 * @motto My code , I understand
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberReceiveAddressDao {

    int deleteById(Long id);

    int insertSelective(UmsMemberReceiveAddress record);

    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> queryAllUmsMemberReceiveAddress(UmsMemberReceiveAddress record);

    int delete(Long id);

    int deleteByIdList(String[] record);

    UmsMemberReceiveAddress queryUmsMemberReceiveAddress(UmsMemberReceiveAddress record);

}
