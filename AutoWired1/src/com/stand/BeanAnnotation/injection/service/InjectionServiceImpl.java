package com.stand.BeanAnnotation.injection.service;

import com.stand.BeanAnnotation.injection.dao.InjectionDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by stand on 2017/2/20.
 */
@Service  //component的细分
public class InjectionServiceImpl implements InjectionService {



    //@Autowired
    private InjectionDAOImpl injectionDAOImpl;  // 1.antowired不再需要set方法



    //@Autowired
    //@Required
    public void setInjectionDAOImpl(InjectionDAOImpl injectionDAOImpl) {   //2.对set方法加autowired
        this.injectionDAOImpl = injectionDAOImpl;
    }

    @Autowired
    public InjectionServiceImpl(InjectionDAOImpl injectionDAOImpl) {    //3.构造器加autowired
        this.injectionDAOImpl = injectionDAOImpl;
    }

    @Override
    public void save(String arg) {
        System.out.println("service:" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAOImpl.save(arg);
    }
}
