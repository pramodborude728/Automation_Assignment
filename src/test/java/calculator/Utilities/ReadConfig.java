package calculator.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

		Properties pro;
		public ReadConfig()
		{
			File src = new File(".\\Configuration\\ReadConfi.properties");
			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
		
		
		
			public String getApplicationURL()
			{
				String url=pro.getProperty("BaseURL");
				return url;
			}
			
			public String getChromepath()
			{
				String chromepath = pro.getProperty("Chromepath");
				return chromepath;
			}

			
			
	}
