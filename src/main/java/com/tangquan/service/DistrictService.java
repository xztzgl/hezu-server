package com.tangquan.service;


import com.tangquan.model.District;

import java.util.List;

/**
 * 管理员服务
 * Author: wangfeng
 * Date: 17/12/1
 * Time: 下午5:33
 */
public interface DistrictService {

    /**
     * 获取所有数据字典列表
     * @return
     */
    List<District> getAllDistrict();

}
