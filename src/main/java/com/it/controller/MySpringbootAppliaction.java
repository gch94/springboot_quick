/**
 * Copyright (C), 2018-2019, XXX有限公司
 * FileName: MySpringbootAppliaction
 * Author:   Administrator
 * Date:     2019-4-29 029 17:34
 * Description: springboot启动引导类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间         版本号             描述
 */
package com.it.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈一句话功能简述〉<br> 
 * 〈springboot启动引导类〉
 *
 * @author Administrator
 * @create 2019-4-29 029
 * @since 1.0.0
 */
@SpringBootApplication
class MySpringbootAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootAppliaction.class);
    }
}