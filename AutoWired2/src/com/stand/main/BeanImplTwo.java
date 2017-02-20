package com.stand.main;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by stand on 2017/2/20.
 */
@Order(value = 50)
@Component
public class BeanImplTwo implements BeanInterface {
}
