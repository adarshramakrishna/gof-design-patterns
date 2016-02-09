/**
 * 
 */
package creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * A client for testing Singleton implementation
 * 
 * @author rkaranth
 *
 */
public class SingletonClient {

	static final int NO_OF_THREADS = 5;
	
	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Create 10 threads to simulate a multi-threaded environment
		ExecutorService service = Executors.newFixedThreadPool(NO_OF_THREADS);
		
		List<Future<Singleton>> singleton = new ArrayList<Future<Singleton>>();
		List<Singleton> singletonList = new ArrayList<Singleton>();
		
		//Give Callable task to the created threads
		for (int i = 0; i < 100; i++) {
			singleton.add(
			service.submit(new Callable<Singleton>() {
				public Singleton call() throws Exception {
					return Singleton.getInstance();
				}
			}));
		}
		
		for (Future<Singleton> obj : singleton) {
			singletonList.add(obj.get());
		}
		
		service.shutdown();
		
		boolean isMultipleInstanceCreated = false;
		for (int i = 0; i < singletonList.size() - 1; i++) {
			if (singletonList.get(i) != singletonList.get(i+1)) {
				isMultipleInstanceCreated = true;
			}
		}
		
		if (!isMultipleInstanceCreated) {
			System.out.println("All is well, there is only a single instance of Singleton class");
		} else {
			System.out.println("Something went wrong!!!!, Multiple instances of Singleton were created");
		}
		
	}

}
