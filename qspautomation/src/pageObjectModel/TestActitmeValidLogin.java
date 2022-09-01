package pageObjectModel;

import java.io.IOException;

public class TestActitmeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		String user = flib.readPropertFile(PROP_PATH, "username");
		String pass = flib.readPropertFile(PROP_PATH, "password");
		lp.validLoginActiTime(user,pass);
		
	
		
	
			
		}
	}


