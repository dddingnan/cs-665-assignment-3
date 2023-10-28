/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: BusinessCustomer.java
 * 
 * Description:
 * Represents a business customer type with a specific email template.
 */
package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public class BusinessCustomer extends Customer {

    /**
     * Constructs a BusinessCustomer with a specified email template.
     * 
     * @param template The email template associated with the customer type.
     */
    public BusinessCustomer(EmailTemplate template) {
        super(template);
    }

    /**
     * Retrieves the customer type of this instance.
     * 
     * @return CustomerType representing the business customer.
     */
    @Override
    public CustomerType getType() {
        return CustomerType.BUSINESS;
    }
}
