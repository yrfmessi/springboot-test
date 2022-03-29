package com.yrf.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author YuRuoFan
 * @Date 2022-03-22 19:25
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String BasicTable() {
        // int i = 10/0;
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String DynamicTable(){
        return "table/dynamic_table";
    }
}
