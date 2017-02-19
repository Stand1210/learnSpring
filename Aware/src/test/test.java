package test;

import main.TestBeanNameAware;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by stand on 2017/2/19.
 */
@ContextConfiguration("classpath:spring-testAware.xml")
public class test extends AbstractJUnit4SpringContextTests {
    //@Resource(name = "TestApplicationContextAware")
    //private TestApplicationContextAware testApplicationContextAware;
    @Resource
    private TestBeanNameAware testBeanNameAware;

    @Test
    public void test1() {
        System.out.println("test:" + testBeanNameAware.hashCode());
    }


}
