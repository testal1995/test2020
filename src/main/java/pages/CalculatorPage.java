package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage {

    @FindBy(css = "div[jsname*='N10B9']")
    public WebElement calc1;

    @FindBy(css = "div[jsname*='XSr6wc']")
    public WebElement calc2;

    @FindBy(css = "div[jsname*='lVjWed']")
    public WebElement calc3;

    @FindBy(css = "div[jsname*='j93WEe']")
    public WebElement calc4;

    @FindBy(css = "div[jsname*='qCp9A']")
    public WebElement calc5;

    @FindBy(css = "div[jsname*='YovRWb']")
    public WebElement calc6;

    @FindBy(css = "div[jsname*='KN1kY']")
    public WebElement calc7;

    @FindBy(css = "div[jsname*='pPHzQc']")
    public WebElement calc8;

    @FindBy(css = "div[jsname*='xAP7E']")
    public WebElement calc9;

    @FindBy(css = "div[jsname*='bkEvMb']")
    public WebElement calc10;

    @FindBy(css = "div[jsname*='WxTTNd']")
    public WebElement calc11;

    @FindBy(css = "div[jsname*='Ax5wH']")
    public WebElement calc12;

    @FindBy(css = "div[jsname*='Pt8tGc']")
    public WebElement calc13;

    @FindBy(css = "div[jsname*='abcgof']")
    public WebElement calc14;

    @FindBy(css = "div[jsname*='zLiRgc']")
    public WebElement Infinity;

    public String formula1 = "(1 + 2) ? 3 - 40 ? 5 =";
    public String formula2 = "«6 ? 0 =";

    public CalculatorPage(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void input (){
        calc4.click();
        calc1.click();
        calc2.click();
        calc3.click();
        calc5.click();
        calc6.click();
        calc7.click();
        calc8.click();
        calc9.click();
        calc10.click();
        calc11.click();
        calc12.click();
        calc13.click();
    }

    public void input2() throws InterruptedException {

        calc14.click();
        calc11.click();
        calc10.click();
        calc13.click();
        Thread.sleep(3000L);
    }


    public String getCacl1(){
        return calc1.getText();
    }
    public String getCacl2(){
        return formula1;
        /*return calc4.getText();
        return calc1.getText();
        return calc2.getText();
        return calc3.getText();
        return calc5.getText();
        return calc6.getText();
        return calc7.getText();
        return calc8.getText();
        return calc9.getText();
        return calc10.getText();
        return calc11.getText();
        return calc12.getText();
        return calc13.getText();

    }
    public String getCacl3(){
        return calc3.getText();
    }
    public String getCacl4(){
        return calc4.getText();
    }
    public String getCacl5(){
        return calc5.getText();
    }
    public String getCacl6(){
        return calc6.getText();
    }
    public String getCacl7(){
        return calc7.getText();
    }
    public String getCacl8(){
        return calc8.getText();
    }
    public String getCacl9(){
        return calc9.getText();
    }
    public String getCacl10(){
        return calc10.getText();
    }
    public String getCacl11(){
        return calc11.getText();
    }
    public String getCacl12(){
        return calc12.getText();
    }
    public String getCacl13(){
        return calc13.getText();
        */
    }

        public String getCalc3(){
            return formula2;
        }
        public String getCalc4(){
            return Infinity.getText();
    }
}
