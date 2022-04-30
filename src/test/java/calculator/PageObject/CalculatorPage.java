package calculator.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

	
	public WebDriver driver;
	
	public CalculatorPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='sciOutPut']")
	WebElement SearchBox;
	@FindBy(xpath="//span[text()='=']")
	WebElement Equalto;
	@FindBy(xpath="//span[text()='0']")
	WebElement Zero;
	@FindBy(xpath="//span[text()='1']")
	WebElement One;
	@FindBy(xpath="//span[text()='2']")
	WebElement Two;
	@FindBy(xpath="//span[text()='3']")
	WebElement Three;
	@FindBy(xpath="//span[text()='4']")
	WebElement Four;
	@FindBy(xpath="//span[text()='5']")
	WebElement Five;
	@FindBy(xpath="//span[text()='6']")
	WebElement Six;
	@FindBy(xpath="//span[text()='7']")
	WebElement Seven;
	@FindBy(xpath="//span[text()='8']")
	WebElement Eight;
	@FindBy(xpath="//span[text()='9']")
	WebElement Nine;
	@FindBy(xpath="//span[text()='+']")
	WebElement Add;
	@FindBy(xpath="//span[text()='–']")
	WebElement Substract;
	@FindBy(xpath="//span[text()='×']")
	WebElement Multiply;
	@FindBy(xpath="//span[text()='/']")
	WebElement Divide;
	@FindBy(xpath="//span[text()='(']")
	WebElement OpenBracket;
	@FindBy(xpath="//span[text()=')']")
	WebElement CloseBracket;
	@FindBy(xpath="//*[@id=\"sciOutPut\"]")
	WebElement ExpectedResult;
	public void Search()
	{
		SearchBox.click();
	}
	public void equalto()
	{
		Equalto.click();
	}
	public void zero()
	{
		Zero.click();
	}
	public void one()
	{
		One.click();
	} 
	public void two()
	{
		Two.click();
	}
	public void three()
	{
		Three.click();
	}
	public void four()
	{
		Four.click();
	}
	public void five()
	{
		Five.click();
	}
	public void six()
	{
		Six.click();
	}
	public void seven()
	{
		Seven.click();
	}
	public void eight()
	{
		Eight.click();
	}
	public void nine()
	{
		Nine.click();
	}
	public void plus()
	{
		Add.click();
	}
	public void minus()
	{
		Substract.click();
	}
	public void multiply()
	{
		Multiply.click();
	}
	public void divide()
	{
		Divide.click();
	}
	public String expectedResult()
	{
	     String Value =ExpectedResult.getText();
	    return Value;
	}
	public void openBracket()
	{
	     OpenBracket.click();
	}
	public void closeBracket()
	{
	     CloseBracket.click();
	}
}




















