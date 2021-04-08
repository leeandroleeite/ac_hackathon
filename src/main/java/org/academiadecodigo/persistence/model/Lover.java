package org.academiadecodigo.persistence.model;

import org.academiadecodigo.persistence.Couple;

import javax.persistence.*;

@Entity
public class Lover extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nickName;
    private String email;
    private String location;

    @ManyToOne
    private Couple couple;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Couple getCouple() {
        return couple;
    }

    public void setCouple(Couple couple) {
        this.couple = couple;
    }

    @Override
    public String toString() {
        return "Lover{" +
                "nickName=" + nickName +
                ", email=" + email +
                ", location=" + location +
                "} " + super.toString();
    }
}
