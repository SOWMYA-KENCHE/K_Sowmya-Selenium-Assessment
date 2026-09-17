package keyworddriven;
import KeywordDriven.saucedemoexecutors;

public class saucedemo {

	public static void main(String[] args) throws InterruptedException {
		saucedemoexecutors sauce = new saucedemoexecutors();
		sauce.executors("LAUNCH_BROWSER");
		sauce.executors("OPEN_URL");
		sauce.executors("USERNAME");
		sauce.executors("PASSWORD");
		Thread.sleep(1000);		
		sauce.executors("LOGIN_BUTTON");
		sauce.executors("CLOSE_BROWSER");
		
	}

}
