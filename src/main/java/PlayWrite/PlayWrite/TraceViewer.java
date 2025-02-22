package PlayWrite.PlayWrite;



import java.util.List;

//import org.openqa.selenium.devtools.v130.page.Page;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TraceViewer {
               
	
	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create();
		 Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
		 Page page = browser.newPage();
       //  page.navigate("https://performanceautomation.engagedly.com/pages/my_corner/v2#overview");
       //  Thread.sleep(2000);
       //  page.getByLabel"user[user_name]").fill('John');
       //  page.locator("//input[@name ='user[user_name]']").fill("adminperformance@teamyogi.com");
       //  page.locator(".password-field").fill("Welcome@123");
      //  page.getByPlaceholder("Email").fill("adminperformance@teamyogi.com");
       //  System.out.println(page.title())
		 page.navigate("https://www.amazon.com/");
		List<String> text = page.locator("a:visible").allInnerTexts();
		for(int i=0 ; i< text.size(); i++)
		{
			System.out.println(text.get(i));
		}
		 
     
	
	}
	
}
