import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class alert {
	public static void main(String[] args) throws Exception {
		 System.out.println("welcome to sleenium training");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		 driver.findElement(By.className("btn-lg")).click();
		 Thread.sleep(5000);
		 driver.switchTo().alert().dismiss();
	}
}
