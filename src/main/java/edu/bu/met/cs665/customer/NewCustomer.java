package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class NewCustomer extends Customer {
    public NewCustomer(EmailTemplate template) {
        super(template);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.NEW;
    }
}
