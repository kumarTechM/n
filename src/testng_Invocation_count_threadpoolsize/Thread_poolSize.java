package testng_Invocation_count_threadpoolsize;

import org.testng.annotations.Test;

public class Thread_poolSize 
{
	@Test(threadPoolSize=3,timeOut=1000)
	public void threadpoolsize()
	{
		System.out.println("i am in  threadpoolsize");
		
	}

}
