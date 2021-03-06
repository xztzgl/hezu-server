package com.tangquan.repository;

import com.tangquan.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 菜单规则
 * Author: wangfeng
 * Date: 17/12/13
 * Time: 下午5:47
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    Customer findOneByUsername(String username);



    Page<Customer> findByUsernameLike(String username, Pageable pageRequest);

    Customer findByUsernameLike(String username);

    Customer findOneById(Integer id);

}
