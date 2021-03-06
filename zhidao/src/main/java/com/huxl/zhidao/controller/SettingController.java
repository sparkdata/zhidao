package com.huxl.zhidao.controller;

import com.huxl.zhidao.service.ZhidaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by nowcoder on 2016/7/10.
 */
@Controller
public class SettingController {
    private static final Logger logger = LoggerFactory.getLogger(SettingController.class);
    @Autowired
    ZhidaoService zhidaoService;

    @RequestMapping(path = {"/setting"}, method = {RequestMethod.GET})
    @ResponseBody
    public String setting(HttpSession httpSession) {
        return "Setting OK. " + zhidaoService.getMessage(1);
    }
}
