package com.ferry.controller;

import com.alibaba.fastjson.JSON;
import com.ferry.entity.Person;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @description:
 * @author:wangrongqing
 * @createTime:2022 07 2022/7/17 12:39
 * @version:1.0
 */
@RestController
@RequestMapping("/travle")
public class TravelController {

    @RequestMapping("/findTravelSites")
    public Map<String, Object> findTravleSites(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("client change");
        System.out.println("second client change");
        String str = "20.205.243.166 github.com-111-113";
        System.out.println("server change");
        System.out.println("second server change");

        Map<String, Object> t_rtn = new HashMap<>();
        t_rtn.put("code", "00");
        t_rtn.put("msg", "success");
        return t_rtn;
    }

    @RequestMapping("/testWebhook")
    public String testWebhook(HttpServletRequest request, HttpServletResponse response) {
        return "webhook success";
    }

    public static String findAllSites(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> t_rtn = new HashMap<>();
        Person person = new Person();
        return Optional.ofNullable(person.getId()).orElse("param is null");
    }

    public static void main(String args[]) {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        String rtn = findAllSites(request, response);
        System.out.println(rtn);
    }


}
