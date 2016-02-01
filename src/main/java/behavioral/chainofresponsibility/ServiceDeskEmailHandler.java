/**
 * 
 */
package behavioral.chainofresponsibility;

/**
 * @author rkaranth
 *
 */
public class ServiceDeskEmailHandler implements EmailHandler {
	
	private final String FROM_SERVICE_DESK_EMAIL_ID = "service-now.com";

	private EmailHandler next;
	
	public EmailHandler setNextHandler(EmailHandler handler) {
		this.next = handler;
		return this.next;
	}

	public void processEmail(Email email) {
		if (email.getFromEmailId().endsWith(FROM_SERVICE_DESK_EMAIL_ID)) {
			System.out.println("Sort and put into Service Desk folder ... ");
		} else {
			next.processEmail(email);
		}
	}

}
