/**
 * 
 */
package behavioral.chainofresponsibility;

/**
 * @author rkaranth
 *
 */
public class Email {
	private String toEmailId;
	private String fromEmailId;
	private String bccEmailId;
	private String subject;
	private String body;
	
	public Email (String toEmailId, String fromEmailId, 
			String bccEmailId, String subject, String body) {
		this.toEmailId = toEmailId;
		this.fromEmailId = fromEmailId;
		this.bccEmailId = bccEmailId;
		this.subject = subject;
		this.body = body;
	}
	
	/**
	 * @return the toEmailId
	 */
	public String getToEmailId() {
		return toEmailId;
	}
	/**
	 * @param toEmailId the toEmailId to set
	 */
	public void setToEmailId(String toEmailId) {
		this.toEmailId = toEmailId;
	}
	/**
	 * @return the fromEmailId
	 */
	public String getFromEmailId() {
		return fromEmailId;
	}
	/**
	 * @param fromEmailId the fromEmailId to set
	 */
	public void setFromEmailId(String fromEmailId) {
		this.fromEmailId = fromEmailId;
	}
	/**
	 * @return the bccEmailId
	 */
	public String getBccEmailId() {
		return bccEmailId;
	}
	/**
	 * @param bccEmailId the bccEmailId to set
	 */
	public void setBccEmailId(String bccEmailId) {
		this.bccEmailId = bccEmailId;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
}
