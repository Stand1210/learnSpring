package main;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by stand on 2017/2/19.
 */
public class TestBeanNameAware implements BeanNameAware, ApplicationContextAware{

    private String beanName;
    //ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-testAware.xml");

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println(beanName);
     //   System.out.println("setBeanName:" + applicationContext.getBean("beanName") + applicationContext.getBean("beanName").hashCode());
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware:" + applicationContext.getBean(beanName).hashCode());
    }
}
