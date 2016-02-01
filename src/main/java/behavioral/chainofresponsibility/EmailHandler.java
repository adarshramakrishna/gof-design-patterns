/**
 * 
 */
package behavioral.chainofresponsibility;

/**
 * @author rkaranth
 *
 */
public interface EmailHandler {
	
	EmailHandler setNextHandler(EmailHandler handler);
	
	void processEmail(Email email);

}
