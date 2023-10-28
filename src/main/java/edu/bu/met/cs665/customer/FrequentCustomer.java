package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class FrequentCustomer extends Customer {
    public FrequentCustomer(EmailTemplate template) {
        super(template);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.FREQUENT;
    }
}
