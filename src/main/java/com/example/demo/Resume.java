package com.example.demo;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Resume {
//@NotNull
//@Min(1)
    private long id;
//@Size(min=3,max=9)
    private String lastname;


    private String firstname;

    //@NotNull
    //@Size(min=7, max=25)
    private String education;

   // @NotNull
   // @Size(min=7, max=25)
    private String email;

   // @NotNull
    //@Size(min=7, max=25)
    private String skills;

    //@NotNull
    //@Size(min=7, max=25)
    private String experiance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }
}