package assign2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	  	driver.get("http://leaftaps.com/opentaps/control/main");
	  	driver.manage().window().maximize();
	  	WebElement elementUsername = driver.findElement(By.id("username"));
	  	elementUsername.sendKeys("Demosalesmanager");
	  	WebElement elementPassword = driver.findElement(By.id("password"));
	  	elementPassword.sendKeys("crmsfa");
	  	driver.findElement(By.className("decorativeSubmit")).click();
	  	driver.findElement(By.className("crmsfa")).click();	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sumithra");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("9/5/1997");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ari");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("vaishu");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("27,kamaraj salai");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("sree nagar nagar");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Tennessee");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600062");
		
		driver.findElement(By.name("submitButton")).click();
	}

}
