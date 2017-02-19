/**
 * Created by stand on 2017/2/19.
 */
package test;

import main.AutoWritingService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;

@ContextConfiguration("classpath:spring-AutoWire.xml")
public class Test extends AbstractJUnit4SpringContextTests{
    @Resource
    private AutoWritingService autoWritingService;

    @org.junit.Test
    public void test() {
        autoWritingService.say();
    }

}
