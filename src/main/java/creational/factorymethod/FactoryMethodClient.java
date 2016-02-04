/**
 * 
 */
package creational.factorymethod;

/**
 * Factory method is a creation pattern. Here an interface is defined
 * for creating the object, but the sub classes decide which classes to
 * instantiate.
 * 
 * Factory method allows class to defer object instantiation to sub classes
 * at runtime
 * 
 * Actors involved in Factory method patter are
 * <li>Abstract Product
 * <li>Product
 * <li>Abstract Creator
 * <li>Creator
 * 
 * @author rkaranth
 *
 */
public class FactoryMethodClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = null;
		
		logger = LoggerCreator.getLoggerCreatorInstance("xml").createLogger();
		logger.logMessage("Creating user id : 123");
		logger.logError("Error occured when updating user id : 134");
		
		logger = LoggerCreator.getLoggerCreatorInstance("db").createLogger();
		logger.logMessage("Submitted application AD3493 for review");
		logger.logError("Error occured when retrieving the application SDF4948375");
		
		logger = LoggerCreator.getLoggerCreatorInstance("stream").createLogger();
		logger.logMessage("Sending file content ...");
		logger.logError("Error when connecting to stream ...");
	}

}
