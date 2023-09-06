package org.example.model;

import lombok.*;


@ToString
@EqualsAndHashCode


public class Employee {
    private int id;

    private String name;

    private String lastname;
    private String gender;
    private int age;

    private int cityId;

    public Employee(int id, String name, String lastname, String gender, int age, int cityId) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }
    public Employee() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}