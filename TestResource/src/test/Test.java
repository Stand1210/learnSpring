/**
 * Created by stand on 2017/2/19.
 */
package test;

import main.TestResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.io.IOException;

@ContextConfiguration("classpath:spring-resource.xml")
public class Test extends AbstractJUnit4SpringContextTests {
    @Resource
    private TestResource resource;

    @org.junit.Test
    public void test() throws IOException {
        resource.resource();
    }
}
