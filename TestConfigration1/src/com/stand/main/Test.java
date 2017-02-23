package com.stand.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by stand on 2017/2/23.
 */
@ContextConfiguration("classpath:spring-config.xml")
public class Test extends AbstractJUnit4SpringContextTests {

    //@Resource
    //private StringStore stringStore;

    @org.junit.Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Store stringStore = (Store) context.getBean("getStringStore");
        System.out.println(stringStore.getClass().getName());
    }
}
