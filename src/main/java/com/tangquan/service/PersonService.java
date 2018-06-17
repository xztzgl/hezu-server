package com.tangquan.service;


import com.tangquan.model.Person;
import com.tangquan.model.request.PersonListReq;
import org.springframework.data.domain.Page;

/**
 * 管理员服务
 * Author: wangfeng
 * Date: 17/12/1
 * Time: 下午5:33
 */
public interface PersonService {

    /**
     * 获取所有用户列表
     * @return
     */
    Page<Person> getAllPerson(PersonListReq personListReq);

}