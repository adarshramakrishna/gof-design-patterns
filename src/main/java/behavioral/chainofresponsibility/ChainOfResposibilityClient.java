/**
 * 
 */
package behavioral.chainofresponsibility;

/**
 * @author rkaranth
 *
 */
public class ChainOfResposibilityClient {

	public static void main(String[] args) {
		Email email1 = new Email("toEmail@abc.com", "fromEmail@payroll.com", "", "SUBJECT", "BODY");
		Email email2 = new Email("toEmail@abc.com", "fromEmail@service-now.com", "", "SUBJECT", "BODY");
		Email email3 = new Email("toEmail@abc.com", "fromEmail@payroll.com", "", "SUBJECT", "BODY");
		
		EmailHandler payrollEmailHandler = new PayrollEmailHandler();
		EmailHandler serviceDeskEmailHandler = new ServiceDeskEmailHandler();
		payrollEmailHandler.setNextHandler(serviceDeskEmailHandler);
		
		payrollEmailHandler.processEmail(email1);
		payrollEmailHandler.processEmail(email2);
		payrollEmailHandler.processEmail(email3);
	}
}
