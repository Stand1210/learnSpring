/**
 * Created by stand on 2017/2/20.
 */
package com.stand.BeanAnnotation.test;

import com.stand.BeanAnnotation.injection.service.InjectionServiceImpl;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-beanAnnotation.xml")
public class test extends AbstractJUnit4SpringContextTests {
    @Resource
    private InjectionServiceImpl injectionServiceImpl;

    @Test
    public void test() {
        injectionServiceImpl.save("stand");
    }

}
