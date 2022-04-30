package calculator.TestCases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.testng.annotations.Test;
import calculator.PageObject.CalculatorPage;

public class Multiplication extends BaseClass
{
	
	@Test
	public void multiplication () throws InterruptedException, IOException
	{
		CalculatorPage num=new CalculatorPage(driver);	
		
		num.four();num.two();num.three();
		num.multiply();
		num.five();num.two();num.five();num.equalto();

		String ExpectedResult = num.expectedResult();
		
		if (ExpectedResult.trim().equals("222075")) 
	    {
			System.out.println("TestCase Passed");
		} else {
			System.out.println("TestCase Failed");
			captureScreen(driver, "Multiplication_Test");
		}
		//assertEquals(ExpectedResult.trim(), "222075");
		
	}

}
