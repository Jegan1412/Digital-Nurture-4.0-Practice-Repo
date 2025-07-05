package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {

    @Id
    @Column(name="co_code")
    private String coCode;
    @Column(name="co_name")
    private String coName;

    public Country() {
    }

    public Country(String coCode, String coName) {
        this.coCode = coCode;
        this.coName = coName;
    }

    public String getcoCode() {
        return coCode;
    }

    public void setcoCode(String coCode) {
        this.coCode = coCode;
    }

    public String getcoName() {
        return coName;
    }

    public void setcoName(String coName) {
        this.coName = coName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "coCode='" + coCode + '\'' +
                ", coName='" + coName + '\'' +
                '}';
    }
}
