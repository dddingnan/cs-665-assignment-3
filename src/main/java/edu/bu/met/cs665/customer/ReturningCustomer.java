package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class ReturningCustomer extends Customer {
    public ReturningCustomer(EmailTemplate template) {
        super(template);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.RETURNING;
    }
}
