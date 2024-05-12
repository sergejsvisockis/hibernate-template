package io.github.sergejsvisockis.template.hibernate.dao;

import io.github.sergejsvisockis.template.hibernate.model.Customer;

public class CustomerDAO extends GenericJPADAO<Customer, Long> {
    public CustomerDAO() {
        super(Customer.class);
    }
}
