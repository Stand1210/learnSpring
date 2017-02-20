package com.stand.test;

import com.stand.main.BeanInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by stand on 2017/2/20.
 */

@Component
public class BeanInvoked {

    @Autowired
    private List<BeanInterface> list;

    @Autowired
    private Map<String, BeanInterface> map;

    @Autowired
    @Qualifier(value = "beanImplTwo")
    private BeanInterface beanInterface;

    public void say() {
        if(list != null && list.size() != 0) {
            System.out.println("list...");
            for(BeanInterface bean : list) {
                System.out.println(bean.getClass().getName() + "   &&   " + " list's size = " + list.size());
            }
        } else {
            System.out.println("List<BeanInterface> list is null!!  &  list's size = " + "    &&   " + list.size());
        }

        System.out.println();

        if(map != null && map.size() != 0) {
            System.out.println("map...");
            for(Map.Entry<String, BeanInterface> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "      " + entry.getValue().getClass().getName() + "   &&   " + "map's size = " + map.size());
            }
        } else {
            System.out.println("Map<String, BeanInterface> map is null!!  &  map's size = " + map.size());
        }

        System.out.println();

        System.out.println(beanInterface.getClass().getName());
    }
}
