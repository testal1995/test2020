package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalculatorPage;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTest {

    private static WebDriver driver;
    private static CalculatorPage calculatorPage;
    private static SearchPage searchPage;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        calculatorPage = new CalculatorPage(driver);
        searchPage = new SearchPage(driver);
    }

    @BeforeEach
    public void setup (){
        driver.get("http://google.com");
        searchPage.search("Calculator");
    }

    @Test
    @DisplayName("Проверка кнопки")
    public void test(){

        calculatorPage.input();
        assertEquals("1", calculatorPage.getCacl1());


    }


    @AfterAll
    public static void teardown(){
        driver.quit();
    }

}
