package test;

import main.BeanLifeCycle;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

/**
 *  结论Bean的生命周期中有限执行implements的接口的覆盖方法
 *  其次执行在xml文件中设置的init-method, destory-method
 *
 *  自动default-init-method在有上面两种方法时不生效
 */

/**
 * Created by stand on 2017/2/17.
 */
@ContextConfiguration("classpath:spring-beanLifeCycle.xml")
public class TestBeanLifeCycle extends AbstractJUnit4SpringContextTests {

    @Resource(name = "BeanLifeCycle")
    private BeanLifeCycle beanLifeCycle;

    @Test
    public void test1() {
        Object obj = beanLifeCycle;
    }
}
