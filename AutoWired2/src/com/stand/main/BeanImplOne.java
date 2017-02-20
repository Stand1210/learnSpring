package com.stand.main;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by stand on 2017/2/20.
 */
@Order(value=100)    //Order用来调整数组中元素的顺序， 此参数对map无效
@Component
public class BeanImplOne implements BeanInterface {
}
