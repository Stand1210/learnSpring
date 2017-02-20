/**
 * Created by stand on 2017/2/20.
 */
package com.main;

import org.springframework.stereotype.Component;

@Component("bean")  //不在component中注册name时，默认为在xml配置文件中name为小写首字母的类名
public class BeanAnnotation {

    public void say(String str) {
        System.out.println("BeanAnnotation:" + str);
    }

}
