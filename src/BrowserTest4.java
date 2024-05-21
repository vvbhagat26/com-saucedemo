import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest4 {
    /**
     * 1. Setup chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Enter the email to email field.
     * 7. Enter the password to password field.
     * 8. Click on Login Button.
     * 9. Print the current url.
     * 10. Navigate to baseUrl
     * 11. Refresh the page.
     * 12. Close the browser.
     */

    public static void main(String[] args) throws InterruptedException {
        String baseurl = "https://www.saucedemo.com/"; //I want to open this url

        //Launch the Chrome Browser- then How to create an object of chrome browser
        WebDriver driver = new ChromeDriver();

        //Open the url into browser
        driver.get(baseurl);//or use directly the given url

        //To get the title of a website
        String title = driver.getTitle();
        System.out.println(" The title of the page " + title);

        //Get current url eg. login
        String currenturl = driver.getCurrentUrl();
        System.out.println("The current url : " + currenturl);

        //Get page source
        System.out.println("The source :" + driver.getPageSource());

        //Enter the email to email field
        WebElement email = driver.findElement(By.id("user-name"));
        email.clear();
        email.sendKeys("visual_user");

        //Enter the password in a password field
        WebElement password = driver.findElement(By.id("password"));
        password.clear();
        password.sendKeys("secret_sauce");

        // Assuming the login button has the name 'login'
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        //print the current url back
        System.out.println("Get current url :" + driver.getCurrentUrl());

        //Navigate to base url
        driver.navigate().to(baseurl);

        //Refresh the page
        driver.navigate().refresh();

        //Close the browser
        driver.quit();

    }
}
