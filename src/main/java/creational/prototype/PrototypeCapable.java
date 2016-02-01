/**
 * 
 */
package creational.prototype;

/**
 * @author rkaranth
 *
 */
public interface PrototypeCapable extends Cloneable{

	PrototypeCapable clone() throws CloneNotSupportedException;
}
