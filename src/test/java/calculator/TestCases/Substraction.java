package calculator.TestCases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.Test;
import calculator.PageObject.CalculatorPage;

public class Substraction extends BaseClass

{

	@Test
	public void substraction() throws IOException
	{
		CalculatorPage num = new CalculatorPage(driver);
		
		num.two();num.three();num.four();num.eight();num.two();num.three();
		num.minus();
		num.openBracket();num.minus();num.two();num.three();num.zero();num.nine();num.four();num.eight();num.two();num.three();num.closeBracket();
		
		String ExpectedResult = num.expectedResult();
		
		if (ExpectedResult.trim().equals("23329646")) 
	    {
			System.out.println("TestCase Passed");
		} else {
			System.out.println("TestCase Failed");
			captureScreen(driver, "Substraction_Test");
		}
		//assertEquals(ExpectedResult.trim(), "23329646");
	}
}
