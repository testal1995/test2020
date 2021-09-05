package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    @FindBy(css = "div[jsname*='N10B9']")
    public WebElement calc1;

    public CalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void input (){
    calc1.click();
    }
    public String getCacl1(){
        return calc1.getText();
    }


}
