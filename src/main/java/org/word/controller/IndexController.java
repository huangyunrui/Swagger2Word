package org.word.controller;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.word.entity.Page;
import org.word.service.Myservice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiuyin.cui
 * @Description
 * @date 2019/3/22 10:52
 */
@Controller
public class IndexController {

    @Autowired
    private Myservice myservice;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        return "index";
    }


    @ResponseBody
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public String add(@ModelAttribute Page user){
        String url = user.getUrl();
        if (user.getNum() > 1000){
            return "";
        }
        int num = user.getNum();
        myservice.doGet(url,num);

        return "ok";
    }

}
