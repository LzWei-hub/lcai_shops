package com.lcai.dao;

import com.lcai.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @auther LzWei
 * @description 搜索系统中的商品管理自定义Dao
 * @date 2025/4/2
 * @github https://github.com/LzWei-hub
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
