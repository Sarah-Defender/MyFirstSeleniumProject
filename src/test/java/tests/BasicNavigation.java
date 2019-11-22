package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Throwable {
        WebDriverManager.chromedriver().setup();//to set up chrome driver
        ChromeDriver driver = new ChromeDriver();
        String url = "http://google.com";
        String url2 = "http:amazon.com";

        driver.get(url);
       driver.navigate().refresh();
        Thread.sleep(3000);//will put the current url on hold for 3 second before its closed

        driver.navigate().to(url2);//navigate to amazon.com

        Thread.sleep(3000);

        driver.navigate().back();//this will navigate back to the previous url

        Thread.sleep(3000);
       driver.navigate().forward();
       Thread.sleep(3000);
        driver.close();//it will close whatever url was opened



    }
}
