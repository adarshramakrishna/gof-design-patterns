/**
 * 
 */
package creational.factorymethod;

/**
 * A concrete implementation of {@link Logger} for a hypothetical DB logging
 * 
 * @author rkaranth
 *
 */
public class DBLogger extends Logger {

	/**
	 * Logs info messages
	 */
	@Override
	public void logMessage(String message) {
		System.out.println("Logging info "+message+" into DB using DB Logger");
	}

	/**
	 * Logs error messages
	 */
	@Override
	public void logError(String error) {
		System.out.println("Logging error "+error+" into DB using DB Logger");
	}

}
