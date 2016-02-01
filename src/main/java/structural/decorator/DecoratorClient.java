/**
 * 
 */
package structural.decorator;

/**
 * <b>Decorator Pattern</b>
 * Add or remove additional functionalities or responsibilities from 
 * the object dynamically without impacting the original object.
 * 
 * At times it is required when addition of functionalities is not 
 * possible by sub classing as it might create loads of subclasses.
 * 
 * This pattern is useful when we don’t want to use inheritance 
 * and rather use composition.
 * 
 * @author rkaranth
 */
public class DecoratorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Basic car ... ");
		Car basicCar = new BasicCar();
		basicCar.moveForward();
		
		System.out.println("Sports car ... ");
		SportsCar sportsCar = new SportsCar(basicCar);
		sportsCar.moveForward();
		sportsCar.doSuperThrottle();
		
		System.out.println("Hybrid car ... ");
		HybridCar hybridCar = new HybridCar(basicCar);
		hybridCar.moveForward();
		hybridCar.useBattery();
		hybridCar.useFuel();
		
		System.out.println("Hybrid HatchBack car ... ");
		HatchBackCar hatchBackCar = new HatchBackCar(basicCar);
		hatchBackCar.moveForward();
		hatchBackCar.applyABSBreak();
	}

}
