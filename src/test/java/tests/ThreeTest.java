package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base {
	public WebDriver driver;

	@Test
	public void TestThree() throws InterruptedException, IOException {

		System.out.println("TestThree");
		 driver = initializeDriver();

		driver.get("http://tutorialsninja.com/demo/");

		Thread.sleep(3000);

		driver.close();
	}

}
