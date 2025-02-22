package PlayWrite.PlayWrite;

import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class PlaywrighteBasics {
    public static void main(String[] args) {
    	    
            Playwright playwright = Playwright.create();
            LaunchOptions lp = new LaunchOptions();
            lp.setChannel("chrome");
            lp.setHeadless(false);
            Browser browser = playwright.chromium().launch(lp);
            Page page = browser.newPage();
            page.navigate("http://google.com");
            System.out.println(page.title());
        
    }
}

