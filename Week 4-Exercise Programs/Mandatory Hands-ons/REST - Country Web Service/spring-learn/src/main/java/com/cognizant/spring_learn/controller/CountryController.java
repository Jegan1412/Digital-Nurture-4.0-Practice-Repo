package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

    @RequestMapping("/country")
    @ResponseBody
    public Country getCountryIndia(){
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("countryIndia", Country.class);
        return country;
    }
}
