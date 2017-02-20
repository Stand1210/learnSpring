package com.stand.BeanAnnotation.injection.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by stand on 2017/2/20.
 */

@Repository   //component的细分
public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String str) {
        System.out.println("保存数据:" + str);
    }
}
