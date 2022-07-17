package com.ferry.controller;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @description:
 * @author:wangrongqing
 * @createTime:2022 07 2022/7/17 12:39
 * @version:1.0
 */
@RestController
public class TravelController {

    public Map<String, Object> findTravleSites(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("client change");
        System.out.println("second client change");
        String str = "20.205.243.166 github.com-111-113";
        System.out.println("server change");
        System.out.println("second server change");
        return null;
    }

}
