/**
 * Created by stand on 2017/2/20.
 */
package com.test;

import com.main.BeanAnnotation;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-BeanAnnotation.xml")
public class TestAnnotation extends AbstractJUnit4SpringContextTests {

    //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-BeanAnnotation.xml");
    @Resource(name = "bean")
    private BeanAnnotation beanAnnotation;

    @Test
    public void test() {
       // BeanAnnotation beanAnnotation = (BeanAnnotation) context.getBean("bean");
        beanAnnotation.say("stand");
    }
}
