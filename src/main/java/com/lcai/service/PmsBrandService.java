package com.lcai.service;


import com.lcai.mbg.model.PmsBrand;

import java.util.List;

/**
 * @auther LzWei
 * @description PmsBrandService
 * @date 2025/4/3
 * @github https://github.com/LzWei-hub
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
