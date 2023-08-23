import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SecondTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver2=new ChromeDriver(options);

        driver2.get("http://www.technovaschool.com/");

        String actualURL= driver2.getCurrentUrl();
        String expectedURL="technovaschool";

        if (actualURL.contains(expectedURL)){
            System.out.println("Test pass");
        }else {
            System.out.println("Test fail");
        }
        System.out.println(driver2.getTitle());

    }
}
