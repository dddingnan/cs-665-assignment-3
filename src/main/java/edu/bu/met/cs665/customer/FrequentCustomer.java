/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: FrequentCustomer.java
 * 
 * Description:
 * Represents a frequent customer type and provides the associated 
 * email template for communication.
 */
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
