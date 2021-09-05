package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalculatorPage;
import pages.SearchPage;
import static org.junit.jupiter.api.Assertions.assertAll;
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
        //options.addArguments("lang=en-GB");
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
        assertAll(
                () -> assertEquals("(1 + 2) × 3 - 40 ÷ 5 =", calculatorPage.getCacl2()),
                () -> assertEquals("1", calculatorPage.getCacl1())
                /*() -> assertEquals("+", calculatorPage.getCacl2()),
                () -> assertEquals("2", calculatorPage.getCacl3()),
                () -> assertEquals("(", calculatorPage.getCacl4()),
                () -> assertEquals(")", calculatorPage.getCacl5()),
                () -> assertEquals("*", calculatorPage.getCacl6()),
                () -> assertEquals("3", calculatorPage.getCacl7()),
                () -> assertEquals("-", calculatorPage.getCacl8()),
                () -> assertEquals("4", calculatorPage.getCacl9()),
                () -> assertEquals("0", calculatorPage.getCacl10()),
                () -> assertEquals("÷", calculatorPage.getCacl11()),
                () -> assertEquals("5", calculatorPage.getCacl12()),
                () -> assertEquals("=", calculatorPage.getCacl13())

                 */
        );
    }


    @AfterAll
    public static void teardown(){
        driver.quit();
    }

}
