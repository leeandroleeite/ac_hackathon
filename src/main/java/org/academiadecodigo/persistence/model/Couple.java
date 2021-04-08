package org.academiadecodigo.persistence.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Couple {

    private String coupleName;
    private int password;
    private Date theBeginning;
    private Date lastFarewell;
    private String picture;
    private String yinMail;
    private String yinLocation;
    private String yangMail;
    private String yangLocation;

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String firstName) {
        this.coupleName = firstName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Date getTheBeginning() {
        return theBeginning;
    }

    public void setTheBeginning(Date theBeginning) {
        this.theBeginning = theBeginning;
    }

    public Date getLastFarewell() {
        return lastFarewell;
    }

    public void setLastFarewell(Date lastFarewell) {
        this.lastFarewell = lastFarewell;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getYinMail() {
        return yinMail;
    }

    public void setYinMail(String yinMail) {
        this.yinMail = yinMail;
    }

    public String getYinLocation() {
        return yinLocation;
    }

    public void setYinLocation(String yinLocation) {
        this.yinLocation = yinLocation;
    }

    public String getYangMail() {
        return yangMail;
    }

    public void setYangMail(String yangMail) {
        this.yangMail = yangMail;
    }

    public String getYangLocation() {
        return yangLocation;
    }

    public void setYangLocation(String yangLocation) {
        this.yangLocation = yangLocation;
    }

    @Override
    public String toString() {

        return "Customer{" +
                "firstName='" + coupleName + '\'' +
                ", lastName='" + password + '\'' +
                ", email='" + theBeginning + '\'' +
                ", phone='" + lastFarewell + '\'' +
                "} " + super.toString();
    }

}
