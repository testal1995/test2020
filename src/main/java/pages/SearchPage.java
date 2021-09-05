package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement searchInput;

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
    }
}