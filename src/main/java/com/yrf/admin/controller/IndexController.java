package com.yrf.admin.controller;

import com.yrf.admin.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @Description
 * @Author YuRuoFan
 * @Date 2022-03-22 16:53
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping(value = {"/", "/login"})
    public String loginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){
        if(StringUtils.hasLength(user.getUsername()) && "123456".equals(user.getPassword())){
            session.setAttribute("loginUser", user);
            return "redirect:/index.html";
        } else{
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }
    }

    @GetMapping("/index.html")
    public String mainPage(HttpSession session, Model model){
        log.info("当前方法为:" + "mainPage");
//        Object loginUser = session.getAttribute("loginUser");
//
//        if(loginUser != null) {
//            return "index";
//        } else {
//            model.addAttribute("msg", "请登录");
//            return "login";
//        }
        return "index";
    }
}
