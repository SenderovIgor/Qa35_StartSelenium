import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test

    public void goToPhoneBook(){
        //open browser
        wd=new ChromeDriver();
        //do to phonebook
        wd.get("https://contacts-app.tobbymarshall815.vercel.app/");
        //close browser
//        wd.close();
        wd.quit();
    }
}
