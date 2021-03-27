import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class select_single_multiselect {
	public static void main(String[] args) throws Exception {
		 System.out.println("welcome to sleenium training");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		   
		 driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
		 Select dd=new Select(driver.findElement(By.id("multi-select")));
		 dd.selectByVisibleText("Ohio");
		 driver.findElement(By.id("printMe")).click();
		 
		
		 dd.selectByVisibleText("Ohio");
		 dd.selectByVisibleText("Florida");
		 dd.selectByVisibleText("New York");
		 driver.findElement(By.id("printAll")).click();
         
	}
}