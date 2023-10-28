/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: VIPCustomer.java
 * 
 * Description:
 * Represents a vip customer type and provides the associated 
 * email template for communication.
 */
package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class VIPCustomer extends Customer {
    public VIPCustomer(EmailTemplate template) {
        super(template);
    }

    @Override
    public CustomerType getType() {
        return CustomerType.VIP;
    }
}
