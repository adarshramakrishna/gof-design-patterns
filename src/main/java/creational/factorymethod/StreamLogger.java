/**
 * 
 */
package creational.factorymethod;

/**
 * A concrete implementation of {@link Logger} for a hypothetical Stream logging
 * 
 * @author rkaranth
 *
 */
public class StreamLogger extends Logger {

	/**
	 * Logs info messages
	 */
	@Override
	public void logMessage(String message) {
		System.out.println("Logging info "+message+" to output stream using Stream Logger");
	}

	/**
	 * Logs error messages
	 */
	@Override
	public void logError(String error) {
		System.out.println("Logging error "+error+" to output stream using Stream Logger");
	}

}
