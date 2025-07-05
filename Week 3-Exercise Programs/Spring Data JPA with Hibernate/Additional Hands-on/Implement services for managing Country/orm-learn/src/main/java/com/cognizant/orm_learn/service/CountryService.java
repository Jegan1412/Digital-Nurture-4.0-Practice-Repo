package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }

    @Transactional
    public Object getCountryById(String coCode){
        return countryRepository.findById(coCode);
    }

    @Transactional
    public List<Country> getCountriesWithPartialName(String pName){
        return countryRepository.findByCoNameContainingIgnoreCase(pName);
    }

    @Transactional
    public String addNewCountry(String coCode, String coName){
        countryRepository.save(new Country(coCode, coName));
        return "Country Added";
    }

    @Transactional
    public String updateCountry(String coCode, String coName){
        countryRepository.deleteById(coCode);
        countryRepository.save(new Country(coCode, coName));
        return "Country Updated";
    }

    @Transactional
    public String deleteCountry(String coCode){
        countryRepository.deleteById(coCode);
        return "Country Deleted";
    }
}
