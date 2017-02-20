package com.stand.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by stand on 2017/2/20.
 */

@ContextConfiguration("classpath:spring-AutoWired.xml")
public class Test extends AbstractJUnit4SpringContextTests {

    @Resource
    private BeanInvoked beanInvoked;

    @org.junit.Test
    public void test() {
        beanInvoked.say();
    }
}
