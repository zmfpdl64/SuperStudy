package org.example.person;

import java.io.Serializable;

public class Person implements Serializable {

    private final long serialVersionUID = 1L;
    private String fullName;
    private Integer years;
    private String gender;

    public Person(String name, Integer age, String gender) {
        this.fullName = name;
        this.years = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
