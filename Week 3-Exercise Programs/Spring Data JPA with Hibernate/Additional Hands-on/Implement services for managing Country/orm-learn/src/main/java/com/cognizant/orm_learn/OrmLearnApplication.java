package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);

		CountryService service = context.getBean(CountryService.class);

		System.out.println("ALL COUNTRIES:\n" + service.getAllCountries());

		System.out.println("COUNTRY:\n" + service.getCountryById("IN"));

		System.out.println("ALL COUNTRIES WITH SIMILAR NAME:\n" + service.getCountriesWithPartialName("in"));

		System.out.println("NEW COUNTRY:\n" + service.addNewCountry("NC","New Country"));

		System.out.println("UPDATE COUNTRY:\n" + service.updateCountry("NC", "Updated Country"));

		System.out.println("DELETE COUNTRY:\n" + service.deleteCountry("NC"));



	}
}
