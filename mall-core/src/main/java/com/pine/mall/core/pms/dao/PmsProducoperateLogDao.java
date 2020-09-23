package com.pine.mall.core.pms.dao;

import java.util.List;

import com.pine.mall.core.pms.entity.PmsProducoperateLog;

/**
 * @author Pine
 * @motto My code
 * @email 771190883@qq.com
 * @date 2020-09-23 18:16:40
 */
public interface PmsProducoperateLogDao {

    int delete(Long id);

    int insertSelective(PmsProducoperateLog record);

    PmsProducoperateLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProducoperateLog record);

    List<PmsProducoperateLog> queryAllPmsProducoperateLog(PmsProducoperateLog record);


    PmsProducoperateLog queryPmsProducoperateLog(PmsProducoperateLog record);

}
