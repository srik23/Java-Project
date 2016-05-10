import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Concurent {
	
	// create an innner class for implementing runnable
	class runnableTest  implements Runnable {

		public void run() {
			System.out.println(" in Run ");
		}
		
	 }
	
	    private runnableTest getRunnableTest(){
	    	runnableTest runTest = new runnableTest();
	    	return runTest;
		  
	    }
	    
	    
		class CallableTest  implements Callable<String> {

			public String  call() throws Exception {
				
				System.out.println(" in Call ");
				
				//return System.currentTimeMillis();
				
				 return Thread.currentThread().getName();
			}

		 }
	
	
	    private CallableTest getCallableTest(){
	    	CallableTest calTest = new CallableTest();
	    	return calTest;
		  
	    }
		
		
	
	
	public static void main( String  []args ){
		
	
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		//ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		//ExecutorService executorService3 = Executors.newScheduledThreadPool(10);
		
		
	
		executor.execute(new Concurent().getRunnableTest());
		
		
		
		Future<String> future = executor.submit(new Concurent().getCallableTest());
		
		try {
			System.out.println("future.get   " + future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Future<Long> future = executor.submit(new Concurent().getCallableTest());
//		
//		System.out.println("future.isDone   " + future.isDone());
//		try {
//			System.out.println("future.get " + future.get());
//		} catch (InterruptedException e) {
//						e.printStackTrace();
//		} catch (ExecutionException e) {
//			
//			e.printStackTrace();
//		}
		
		
		
		System.out.println("future.isDone   " + future.isDone());
		
		
//		executor.execute(new Runnable() {
//			
//			public void run() {
//				
//			    System.out.println(" in Run ");
//			
//				
//			}
//		});
		
	    // This will make the executor accept no new threads
	    // and finish all existing threads in the queue
	    executor.shutdown();
	  
	    
	    System.out.println("Finished all threads");
		
	}
	
	
   
    
    
    

    
	

}
