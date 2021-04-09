package org.academiadecodigo.persistence.model;


public class Couple {

    private String coupleName;
    private String password;
    private String theBeginning;
    private String lastFarewell;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTheBeginning() {
        return theBeginning;
    }

    public void setTheBeginning(String theBeginning) {
        this.theBeginning = theBeginning;
    }

    public String getLastFarewell() {
        return lastFarewell;
    }

    public void setLastFarewell(String lastFarewell) {
        this.lastFarewell = lastFarewell;
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
