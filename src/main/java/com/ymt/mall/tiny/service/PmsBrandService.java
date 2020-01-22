package com.ymt.mall.tiny.service;

import com.ymt.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author yangmingtian
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
