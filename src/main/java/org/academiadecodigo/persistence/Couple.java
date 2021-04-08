package org.academiadecodigo.persistence;

import org.academiadecodigo.persistence.model.AbstractModel;
import org.academiadecodigo.persistence.model.Lover;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "couple")
public class Couple extends AbstractModel {

    @Id
    @Column(unique = true)
    private String coupleName;

    private String password;
    private Date theBeginning;
    private Date lastFarewell;
    private String picture;

    @OneToMany(
            cascade = {CascadeType.ALL},
            orphanRemoval = true,
            mappedBy = "couple",
            fetch = FetchType.EAGER
    )
    private List<Lover> lovers = new ArrayList<>();

    public String getCoupleName() {
        return coupleName;
    }

    public void setCoupleName(String firstName) {
        this.coupleName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String lastName) {
        this.password = lastName;
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

    public List<Lover> getLovers() {
        return lovers;
    }

    public void setLovers(List<Lover> lovers) {
        this.lovers = lovers;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {

        return "Customer{" +
                "firstName='" + coupleName + '\'' +
                ", lastName='" + password + '\'' +
                ", email='" + theBeginning + '\'' +
                ", phone='" + lastFarewell + '\'' +
                ", accounts=" + lovers +
                "} " + super.toString();
    }

}
