package com.cognizant.orm_learn.controller;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/getAllCountries")
    @ResponseBody
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }

    @GetMapping("/Country/{coCode}")
    @ResponseBody
    public Object getCountryByCode(@PathVariable String coCode){
        return countryService.getCountryById(coCode);
    }

    @GetMapping("/Countries/{pName}")
    @ResponseBody
    public List<Country> getCountriesWithPartialName(@PathVariable String pName){
        return countryService.getCountriesWithPartialName(pName);
    }

    @PostMapping("/addCountry/{coCode}/{coName}")
    @ResponseBody
    public void addNewCountry(@PathVariable String coCode, @PathVariable String coName){
        countryService.addNewCountry(coCode, coName);
        System.out.println("Country Added");
    }

    @PutMapping("/updateCountry/{coCode}/{coName}")
    @ResponseBody
    public void updateCountry(@PathVariable String coCode, @PathVariable String coName){
        countryService.updateCountry(coCode, coName);
        System.out.println("Country Updated");
    }

    @DeleteMapping("/deleteCountry/{coCode}")
    @ResponseBody
    public void deleteCountry(@PathVariable String coCode){
        countryService.deleteCountry(coCode);
        System.out.println("Country Deleted");
    }
}
