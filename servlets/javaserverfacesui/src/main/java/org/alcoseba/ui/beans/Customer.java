package org.alcoseba.ui.beans;

import ejbs.session.bid.PlaceBidBean;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Customer {
    @EJB
    private PlaceBidBean placeBidBean;

    private String firstName;
    private String lastName;
    private String email;

    public String save() {
        System.out.println(placeBidBean.getMessage());
        return "/confirmation.xhtml";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
