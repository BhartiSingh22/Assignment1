package com.crm.qa.config;
import java.io.FileNotFoundException;
public class ConfigReader {
private Properties prop;
public ConfigReader()
{
this.prop = new Properties();
try{
     InputStream ip= ConfigReader.class.getClassLoader().getResourceAsStream(“com\\crm\\qa\\config\\config.properties”);
this.prop.load(ip);
ip.close();
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
catch(IOException e)
{
e.printStackTrace();
}
}

public String getDriverType() {
return this.prop.getProperty(“driverType”);
}
}
