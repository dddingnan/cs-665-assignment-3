package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class BusinessCustomer extends Customer {
    public BusinessCustomer(EmailTemplate template) {
        super(template);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.BUSINESS;
    }
}
