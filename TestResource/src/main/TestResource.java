/**
 * Created by stand on 2017/2/19.
 */
package main;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.io.IOException;

public class TestResource implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
        org.springframework.core.io.Resource resource = applicationContext.getResource("file:~/stand/workspace/learnSpring/TestResource/src/config.txt");
        //file   classpath     http    (none)
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
