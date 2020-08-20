package com.mall.member.service;

import com.mall.core.ums.entity.UmsMemberReceiveAddress;
import java.util.List;

/**
 * 会员收货地址表
 * @motto My code
 * @author Pine
 * @email 771190883@qq.com
 * @date 2020-08-20 15:05:28
 */
public interface UmsMemberReceiveAddressService {

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressList(UmsMemberReceiveAddress record);

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByPage(UmsMemberReceiveAddress record, Integer pageSize, Integer pageNum);

    UmsMemberReceiveAddress getUmsMemberReceiveAddressById(Long id);

    UmsMemberReceiveAddress getUmsMemberReceiveAddress(UmsMemberReceiveAddress record);

    int createUmsMemberReceiveAddress(UmsMemberReceiveAddress record);

    int delete(Long id);

    int updateUmsMemberReceiveAddress(UmsMemberReceiveAddress record);

}

