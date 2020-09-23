package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducvertifyRecord;

/**
 * 商品审核记录
 *
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:40
 */
public interface PmsProducvertifyRecordDao {

    int delete(Long id);

    int insertSelective(PmsProducvertifyRecord record);

    PmsProducvertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducvertifyRecord record);

    List<PmsProducvertifyRecord> queryAllPmsProducvertifyRecord(PmsProducvertifyRecord record);


    PmsProducvertifyRecord queryPmsProducvertifyRecord(PmsProducvertifyRecord record);

}
