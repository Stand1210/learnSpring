package com.stand.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by stand on 2017/2/23.
 */
@Configuration
public class StoreConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")           //不写（name = "")时，默认获取bean的名字是方法名  eg:context.getBean("getStringStore")
    public Store getStringStore() {
        return new StringStore();
    }
}
