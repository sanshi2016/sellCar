package com.car.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 孙磊 on 2018/7/13
 * @version 1.0
 * @apiNote 辅助通用类
 */
public class Assist {
    /**日志输出工具*/
    public static Logger logger=LoggerFactory.getLogger("Assist");
    /**
     * @author 孙磊 on 2018/7/13
     * @apiNote 调用控制台输出接口
     * @param  o 输出对象
     */
    public static void print(Object o){
        System.out.println(o);
    }
}
