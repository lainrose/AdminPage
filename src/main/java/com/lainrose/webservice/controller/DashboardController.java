package com.lainrose.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    private static final String VIEW_PATH = "dashboard/";

    @RequestMapping( value = "/dashboard", method = RequestMethod.GET )
    public String dashboard(Model model) {
        return VIEW_PATH + "dashboard";
    }

    @RequestMapping( value = "/dashboard2", method = RequestMethod.GET )
    public String dashboard2(Model model) {
        return VIEW_PATH + "dashboard2";
    }

}
