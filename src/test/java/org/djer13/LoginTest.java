package org.djer13;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

public class LoginTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\program\\geckoDriver_026\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() {
        // Test name: Login
        // Step # | name | target | value | comment
        // 1 | open | / |  | 
        driver.get("http://djer13-moodle.clicketcloud.com/");
        // 2 | setWindowSize | 915x694 |  | 
        driver.manage().window().setSize(new Dimension(915, 694));
        // 3 | click | linkText=Log in |  | 
        driver.findElement(By.linkText("Connexion")).click();
        // 4 | click | id=username |  | 
        driver.findElement(By.id("username")).click();
        // 5 | type | id=username | etudtest | 
        driver.findElement(By.id("username")).sendKeys("etudtest");
        // 6 | type | id=password | PassEtud55: | 
        driver.findElement(By.id("password")).sendKeys("PassEtud55:");
        // 7 | click | id=loginbtn |  | 
        driver.findElement(By.id("loginbtn")).click();
        // 8 | assertText | css=.usertext | Etudiant de test Pour tester Selenium IDE | 
        assertThat(driver.findElement(By.cssSelector(".usertext")).getText(),
                is("Etudiant de test Pour tester Selenium IDE"));
    }
}
