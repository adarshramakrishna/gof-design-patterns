/**
 * 
 */
package behavioral.chainofresponsibility;

/**
 * @author rkaranth
 *
 */
public class PayrollEmailHandler implements EmailHandler {

	private final String FROM_PAYROLL_EMAIL_ID = "payroll.com";
	
	private EmailHandler next;
	
	public EmailHandler setNextHandler(EmailHandler handler) {
		this.next = handler;
		return this.next;
	}

	public void processEmail(Email email) {
		if (email.getFromEmailId().endsWith(FROM_PAYROLL_EMAIL_ID)) {
			System.out.println("Sort and put into Payroll email folders ... ");
		} else {
			next.processEmail(email);
		}
	}

}
