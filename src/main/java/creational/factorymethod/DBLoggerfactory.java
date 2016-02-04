/**
 * 
 */
package creational.factorymethod;

/**
 * @author rkaranth
 *
 */
public class DBLoggerfactory extends LoggerCreator {

	@Override
	public Logger createLogger() {
		return new DBLogger();
	}

}
