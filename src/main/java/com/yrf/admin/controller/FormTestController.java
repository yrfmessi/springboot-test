package com.yrf.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Description
 * @Author YuRuoFan
 * @Date 2022-03-28 9:36
 */
@Controller
@Slf4j
public class FormTestController {

    @GetMapping("form_layouts")
    public String formLayouts(){
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg") MultipartFile headerImg,
                         @RequestPart("photo") MultipartFile[] photo) throws IOException {

        log.info("上传的信息: email={} username={}, headerImg={}, photo={}",
                email, username, headerImg.getSize(), photo.length);

        if(!headerImg.isEmpty()){
            //保存到文件服务器
            String originalFilename = headerImg.getOriginalFilename();
            headerImg.transferTo(new File("E:\\cache\\" +originalFilename));
        }

        if(photo.length > 0){
            for(MultipartFile po : photo){
                if(!po.isEmpty()){
                    String originalFilename = po.getOriginalFilename();
                    po.transferTo(new File("E:\\cache\\" +originalFilename));
                }
            }
        }
        return "index";
    }
}
