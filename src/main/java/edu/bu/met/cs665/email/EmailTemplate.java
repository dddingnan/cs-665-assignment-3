/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: EmailTemplate.java
 * 
 * Description:
 * Represents an email template containing a message tailored for a specific customer type.
 */
package edu.bu.met.cs665.email;

import edu.bu.met.cs665.customer.CustomerType;
import java.util.List;

public class EmailTemplate {
    private String customerType;
    private String message;

    /**
     * Constructs an EmailTemplate with a specified customer type and message.
     * 
     * @param customerType Type of customer the template is for.
     * @param message      Email message template.
     */
    public EmailTemplate(String customerType, String message) {
        this.customerType = customerType;
        this.message = message;
    }

    /**
     * Retrieves the customer type of this template.
     * 
     * @return Customer type as a string.
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Retrieves the message of this template.
     * 
     * @return Message as a string.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Searches and retrieves a template matching the specified customer type.
     * 
     * @param templates List of available templates.
     * @param type      Type of customer to search for.
     * @return Matched EmailTemplate.
     * @throws IllegalArgumentException If template for given type isn't found.
     */
    public static EmailTemplate getTemplateByType(List<EmailTemplate> templates, CustomerType type) {
        for (EmailTemplate template : templates) {
            if (template.getCustomerType().equalsIgnoreCase(type.toString())) {
                return template;
            }
        }
        throw new IllegalArgumentException("Template not found for customer type: " + type);
    }
}
