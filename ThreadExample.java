package acadgild;



	public class ThreadExample extends Thread {
		//An interface can extends another interface in the same way class can extend the class
		//The extends keyword extend an interface and the child interface inherits the methods of parent
		//interface
		//created class names as ThreadExample which extends thread to implement thread class
			public void run()
			//extending the thread class is required to override run() method
			//here it contains actual logic to run
		
		//public void run-if this thread object was instantiated using a runnable 
		//target, the run() method is invoked on that runnable
			
			/*here we create run method which will execute when thread is
			 * Called
			 */
			
			{
		/*the code is prone to exceptions is placed in the try block
		*when exception occurs that exception occurred is handled by the 
		*catch block associated with it
		*/
				for(int n=1;n<=10;n++){
					//loop will go for 10 times
					//here sleep() it makes current executing thread to sleep
					//for a specified interval of time. Time is in milli seconds.
					//sleep method throws InterruptedException
					try
				{
						Thread.sleep(3000);
			//here thread will sleep for every given no.of seconds
				}
				catch(InterruptedException e)
				{
			//if not it will get interrupted or terminated		
				}
	
						
				System.out.println("Welcome to Acadgild");
				//it will print for 3 seconds
			}
		}
			public static void main(String[] args) {
				
				// TODO Auto-generated method stub
				ThreadExample object=new ThreadExample();//new object is created
				object.start();//thread gets started.
			}

		}
