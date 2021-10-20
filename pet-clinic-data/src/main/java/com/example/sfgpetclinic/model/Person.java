package com.example.sfgpetclinic.model;

public class Person {

    private String firstname;
    private String lastname;
    private Long id;

    public String getFirstname() {
        return firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
