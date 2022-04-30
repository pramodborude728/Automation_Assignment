package calculator.TestCases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.Test;
import calculator.PageObject.CalculatorPage;

public class Addition extends BaseClass

{

	@Test
	public void addition() throws IOException
	{
		CalculatorPage num = new CalculatorPage(driver);
		
		num.minus(); num.two();num.three();num.four();num.two();num.three();num.four();
		num.plus();
		num.three();num.four();num.five();num.three();num.four();num.five();
		
		String ExpectedResult = num.expectedResult();
		
		if (ExpectedResult.trim().equals("111111")) 
	    {
			System.out.println("TestCase Passed");
		} else {
			System.out.println("TestCase Failed");
			captureScreen(driver, "Addition_Test");
		}
		//assertEquals(ExpectedResult.trim(), "111111");
	}
}
