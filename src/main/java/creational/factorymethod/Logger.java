/**
 * 
 */
package creational.factorymethod;

/**
 * Abstract class that defines the contract for all Logger implementation
 * 
 * @author rkaranth
 *
 */
public abstract class Logger {

	/**
	 * Log info messages
	 * @param message
	 */
	protected abstract void logMessage(String message);
	
	/**
	 * Log error messages
	 * @param error
	 */
	protected abstract void logError(String error);
}
