package PlayWrite.PlayWrite;
import java.nio.file.Paths;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
public class Example {
	  public static void main(String[] args) {
	    Playwright playwright = Playwright.create();
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      context.tracing().start(new Tracing.StartOptions()
	    	  .setScreenshots(true)
	    	  .setSnapshots(true)
	    	  .setSources(true));
	      Page page = context.newPage();
	      
	      page.navigate("https://performanceautomation.engagedly.com");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).fill("adminperformance@teamyogi.com");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("CapsLock");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("W");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).press("CapsLock");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password")).fill("Welcome@123");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign in")).click();
	      page.locator("#myWorkSpace > a").click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Meetings")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add ")).click();
	      page.getByText("New meeting").click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Type here")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Type here")).fill("testing");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Thomas s Shelby  ")).click();
	     // page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search").setExact(true)).fill("deep");
	      //page.locator("#ono-meeting-create-popup").getByText("Deep Sony").click();
	     // page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
	      //page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("")).click();
	      
	      context.tracing().stop(new Tracing.StopOptions()
	    		  .setPath(Paths.get("trace.zip")));
	    }
	  }


