/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfellig
 */
public abstract class Address {

    protected String street;
    protected String city;
    protected String country;
    protected String postalCode;
    protected String addresse;


    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getAddresse() {
        return addresse;
    }

    public abstract String printFullAddress();
    public abstract void validateAddress(Address addr);

    public void setStreet(String newStreet) {
        street = newStreet;
    }

    public void setCity(String newCity) {
        city = newCity;
    }

    public void setCountry(String newCountry) {
        country = newCountry;
    }

    public void setPostalCode(String newPostalCode) {
        postalCode = newPostalCode;
    }
    public void setAddresse(String newAddresse){addresse=newAddresse;}
}
