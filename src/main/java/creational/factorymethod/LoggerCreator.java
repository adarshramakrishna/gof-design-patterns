/**
 * 
 */
package creational.factorymethod;

/**
 * Abstract Creator for product {@link Logger}
 * 
 * @author rkaranth
 *
 */
public abstract class LoggerCreator {
	
	/**
	 * Factory method to create Logger
	 * Each concrete creator that extends this will provide its implementation
	 * Thus deferring the creation of Logger instance to its sub-classes
	 * @return {@link Logger}
	 */
	protected abstract Logger createLogger();
	
	/**
	 * Public method used by clients to get instance of Logger
	 * @return
	 */
	public Logger getLogger() {
		//We will get the logger instance based on the concrete Creator class
		Logger logger = createLogger();
		return logger;
	}

	/**
	 * Static utility method to get concrete Creators.
	 * A String param is used to determine the type concrete creator
	 * @param loggerType
	 * @return {@link LoggerCreator}
	 */
	public static LoggerCreator getLoggerCreatorInstance(String loggerType) {
		LoggerCreator loggerCreator = null;
		if ("xml".equalsIgnoreCase(loggerType)) {
			System.out.println("Initializing XML Logger");
			loggerCreator = new XMLLoggerFactory();
		} else if ("db".equalsIgnoreCase(loggerType)) {
			System.out.println("Initializing Database Logger");
			loggerCreator = new DBLoggerfactory();
		} else if ("stream".equalsIgnoreCase(loggerType)) {
			System.out.println("Initializing Stream Logger");
			loggerCreator = new StreamLoggerFactory();
		}
		
		return loggerCreator;
	}
}
