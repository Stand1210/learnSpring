package main;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by stand on 2017/2/17.
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean{

    public void start()
    {
        System.out.println("start");
    }

    public void stop()
    {
        System.out.println("stop");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    System.out.println("afterPropertiesSet");
    }
}
