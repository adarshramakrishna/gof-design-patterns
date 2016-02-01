/**
 * 
 */
package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rkaranth
 *
 */
public class PrototypeFactory {

	public static enum ModelType {
		EMPLOYEE("EMPLOYEE"),
		MOVIE("MOVIE");
		
		private String model;
		
		private ModelType(String model) {
			this.model = model;
		}
		
		public String getModelType() {
			return this.model;
		}
	}
	
	private static Map<ModelType, PrototypeCapable> prototypeRegistry;
	
	static {
		prototypeRegistry =
				new HashMap<PrototypeFactory.ModelType, PrototypeCapable>();
		prototypeRegistry.put(ModelType.EMPLOYEE, new Employee());
	}
	
	public static PrototypeCapable getClonedInstance(final ModelType modelType) 
			throws CloneNotSupportedException {
		return prototypeRegistry.get(modelType).clone();
	}
}
