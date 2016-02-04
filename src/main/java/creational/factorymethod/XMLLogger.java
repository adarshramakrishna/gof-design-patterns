/**
 * 
 */
package creational.factorymethod;

/**
 * A concrete implementation of {@link Logger} for a hypothetical XML logging
 * 
 * @author rkaranth
 *
 */
public class XMLLogger extends Logger {

	/**
	 * Logs info messages
	 */
	@Override
	public void logMessage(String message) {
		System.out.println("Logging info "+message+" using XML Logger");
	}

	/**
	 * Logs error messages
	 */
	@Override
	public void logError(String error) {
		System.out.println("Logging error"+error+" using XML Logger");
	}

}
