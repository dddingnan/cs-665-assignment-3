package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class VIPCustomer extends Customer {
    public VIPCustomer(EmailTemplate template) {
        super(template);
    }

    @Override
    public String getType() {
        return "VIP";
    }
}
