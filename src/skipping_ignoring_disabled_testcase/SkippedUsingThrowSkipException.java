package skipping_ignoring_disabled_testcase;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippedUsingThrowSkipException {

	@Test
	public void m1()
	{
		throw new SkipException("skipping conditionally");
	}
// now it  will reflected in console as we skipp test case conditionally
}
