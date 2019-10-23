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

public class CourseExistsTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void courseexists() {
        // Test name: Course exists
        // Step # | name | target | value | comment
        // 1 | open | /my/ |  | 
        driver.get("http://djer13-moodle.clicketcloud.com/my/");
        // 2 | setWindowSize | 915x629 |  | 
        driver.manage().window().setSize(new Dimension(915, 629));
        // 3 | click | css=.ml-1 .media-body |  | 
        driver.findElement(By.cssSelector(".ml-1 .media-body")).click();
        // 4 | assertText | css=#section-1 .sectionname a | La qualité | 
        assertThat(driver.findElement(By.cssSelector("#section-1 .sectionname a")).getText(), is("La qualité"));
    }
}