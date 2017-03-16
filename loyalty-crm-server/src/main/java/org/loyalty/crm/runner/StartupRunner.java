package org.loyalty.crm.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by yangzuojie on 2017/3/16.
 * 在项目服务启动的时候就去加载一些数据或做一些事情这样的需求。
 * 启动服务时执行。用于加载参数
 */
@Component
@Order(value = 1)//配置执行顺序（多个CommandLineRunner） 注解的执行优先级是按value值从小到大顺序。
public class StartupRunner implements CommandLineRunner{
    @Override
    public void run(String... strings) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }
}
