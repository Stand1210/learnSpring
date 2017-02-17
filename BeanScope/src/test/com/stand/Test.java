package test.com.stand;

import main.com.stand.BeanScope;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 * Created by stand on 2017/2/17.
 */
@ContextConfiguration("classpath:spring-beanScope.xml")
public class Test extends AbstractJUnit4SpringContextTests{
    @Resource(name = "BeanScope")
    private BeanScope beanScope;

    @org.junit.Test
    public void test1() {

        beanScope.say();
        beanScope.say();

    }

    @org.junit.Test
    public void test2()
    {
        beanScope.say();
    }


    @org.junit.Test
    public void test3()
    {
        beanScope.say();
    }
}
