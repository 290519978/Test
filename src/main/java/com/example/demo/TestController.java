package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/12/24.
 */
@Controller
public class TestController {

    @RequestMapping("/data")
    @ResponseBody
    public String data() {
        return "hello word";
    }
}
