package org.alcoseba.ui.beans;

import ejbs.dao.Bid;
import ejbs.session.bid.PlaceBidBean;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name="customer")
public class CustomerBean {
    @EJB
    private PlaceBidBean placeBidBean;

    private String firstName;
    private String lastName;
    private String email;

    public String save() {
        Bid bid = new Bid();
        bid.setName(firstName);
        placeBidBean.addBid(bid);
        // System.out.println(placeBidBean.getMessage());
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
