import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class facebook {
	public static void main(String[] args) throws Exception {
		 System.out.println("welcome to sleenium training");
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231346502315%7Ce%7Cfacebook%7C&placement=&creative=231346502315&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIj6PLwKbQ7wIViINLBR3kXA0bEAAYASAAEgK-B_D_BwE");
		 driver.findElement(By.name("firstname")).sendKeys("unnati");
		 driver.findElement(By.name("lastname")).sendKeys("agrawal");
		 driver.findElement(By.name("reg_email__")).sendKeys("59689867");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("iamgood");
		 Select drop=new Select(driver.findElement(By.id("day")));
		 drop.selectByIndex(5);
		 Thread.sleep(3000);
		 Select drop2=new Select(driver.findElement(By.id("month")));
		 drop2.selectByIndex(5);
		 Thread.sleep(3000);
		 Select drop3=new Select(driver.findElement(By.id("year")));
		 drop3.selectByIndex(5);
		 Thread.sleep(3000);
	
		 WebElement myradio=driver.findElement(By.cssSelector("input[value='1']"));
		 myradio.click();
		 driver.findElement(By.name("websubmit")).click();
	}
}