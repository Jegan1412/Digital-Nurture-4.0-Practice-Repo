package com.cognizant.spring_learn;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Country {

    private String code;
    private String name;

    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    public Country() {
        LOGGER.info("Inside Country Constructor.");
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getcode() {
        LOGGER.info("Inside code getter");
        return code;
    }

    public void setcode(String code) {
        LOGGER.info("Inside code setter");
        this.code = code;
    }

    public String getname() {
        LOGGER.info("Inside name getter");
        return name;
    }

    public void setname(String name) {
        LOGGER.info("Inside name setter");
        this.name = name;
    }

    @Override
    public String toString() {
        LOGGER.info("Inside toString() method");
        return "Country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
