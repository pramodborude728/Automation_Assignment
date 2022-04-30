package calculator.TestCases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.Test;
import calculator.PageObject.CalculatorPage;


public class Division extends BaseClass
{
	
	@Test
	public void division() throws IOException
	{
		CalculatorPage num = new CalculatorPage(driver);
		num.four(); num.zero(); num.zero();num.zero();
		num.divide();   
		num.two(); num.zero(); num.zero();
	    
	    String ExpectedResult = num.expectedResult();
	    if (ExpectedResult.trim().equals("20")) 
	    {
			System.out.println("TestCase Passed");
		} else {
			System.out.println("TestCase Failed");
			captureScreen(driver, "Division_Test");
		}
	   // assertEquals(ExpectedResult.trim(), "20");
}

}