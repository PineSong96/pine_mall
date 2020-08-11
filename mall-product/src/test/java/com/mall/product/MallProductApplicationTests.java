package com.mall.product;


import com.mall.core.pms.dao.PmsBrandDao;
import com.mall.core.pms.entity.PmsBrand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MallProductApplicationTests {
    @Autowired
    private PmsBrandDao pmsBrandDao;
    @Test
    public void test(){

        List<PmsBrand> pmsBrands = pmsBrandDao.queryAllPmsBrand(null);
    }
}
