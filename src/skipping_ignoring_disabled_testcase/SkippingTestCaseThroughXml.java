package skipping_ignoring_disabled_testcase;

import org.testng.annotations.Test;

public class SkippingTestCaseThroughXml
{
	@Test
	public void m1()
	{
		System.out.println("m1 method");
		
	}
	// we skipped using xml so it will not reflect in console as skip keep note
	@Test
	public void m2()
	{
		System.out.println("m2 method");
	}

}
// xml format 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="skipping_ignoring_disabled_testcase.SkippingTestCaseThroughXml">
      <methods>
      <exclude name="m1"/>
      </methods>
      </class>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

