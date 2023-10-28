import edu.bu.met.cs665.customer.CustomerType;
import edu.bu.met.cs665.email.EmailTemplate;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EmailTemplateTest {

    @Test
    public void testConstructorAndGetters() {
        EmailTemplate template = new EmailTemplate(CustomerType.BUSINESS.toString(), "Business Message");

        assertEquals(CustomerType.BUSINESS.toString(), template.getCustomerType());
        assertEquals("Business Message", template.getMessage());
    }

    @Test
    public void testGetTemplateByTypeValid() {
        EmailTemplate businessTemplate = new EmailTemplate(CustomerType.BUSINESS.toString(), "Business Message");
        EmailTemplate vipTemplate = new EmailTemplate(CustomerType.VIP.toString(), "VIP Message");
        List<EmailTemplate> templates = Arrays.asList(businessTemplate, vipTemplate);

        EmailTemplate foundTemplate = EmailTemplate.getTemplateByType(templates, CustomerType.VIP);
        assertEquals(vipTemplate, foundTemplate);

        foundTemplate = EmailTemplate.getTemplateByType(templates, CustomerType.BUSINESS);
        assertEquals(businessTemplate, foundTemplate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTemplateByTypeInvalid() {
        EmailTemplate businessTemplate = new EmailTemplate(CustomerType.BUSINESS.toString(), "Business Message");
        List<EmailTemplate> templates = Arrays.asList(businessTemplate);

        // This should throw IllegalArgumentException as its don't have a template for
        // VIP
        EmailTemplate.getTemplateByType(templates, CustomerType.VIP);
    }
}
