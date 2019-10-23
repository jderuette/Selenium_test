/**
 * 
 */
package org.djer13;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

/**
 * @author djer1
 *
 */
public class SeleniumHelper {

    public static void login(WebDriver driver, String userName, String password, String userFullNameToCheck) {
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
        driver.findElement(By.id("username")).sendKeys(userName);
        // 6 | type | id=password | PassEtud55: | 
        driver.findElement(By.id("password")).sendKeys(password);
        // 7 | click | id=loginbtn |  | 
        driver.findElement(By.id("loginbtn")).click();
        // 8 | assertText | css=.usertext | Etudiant de test Pour tester Selenium IDE | 
        assertThat(driver.findElement(By.cssSelector(".usertext")).getText(),
                is(userFullNameToCheck));
    }
    
    public static void loginAsStudent(WebDriver driver){
        login(driver, "etudtest", "PassEtud55:", "Etudiant de test Pour tester Selenium IDE");
    }
}
