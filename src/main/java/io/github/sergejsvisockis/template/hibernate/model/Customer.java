package io.github.sergejsvisockis.template.hibernate.model;

import jakarta.persistence.Entity;

@Entity
public class Customer extends BaseEntity {

    private static final long serialVersionUID = 5727478743958755114L;

    private String firstName;
    private String lastName;
    private String customerNumber;

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

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                '}';
    }
}
