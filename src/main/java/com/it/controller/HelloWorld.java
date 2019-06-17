/**
 * Copyright (C), 2018-2019, XXX有限公司
 * FileName: HelloWorld
 * Author:   Administrator
 * Date:     2019-4-29 029 17:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间         版本号             描述
 */
package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019-4-29 029
 * @since 1.0.0
 */
@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
    public String quick(){
        return "Hello World!";
    }
}