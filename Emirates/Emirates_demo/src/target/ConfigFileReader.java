package target;

import java.util.Properties;

public class ConfigFileReader {
	public String getReportConfigPath(){
		Properties p = new Properties();
		 String reportConfigPath = p.getProperty("reportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
	
}
