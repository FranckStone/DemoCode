package com.demo.main;

import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {

	
	private static Logger logger = Logger.getLogger(Main.class); 
	
	public static void main(String[] args) {

        int port = 8081;
        Server server = new Server(port);
        WebAppContext webAppContext = new WebAppContext("webapp","/");  

        webAppContext.setDescriptor("webapp/WEB-INF/web.xml");  
        webAppContext.setResourceBase("src/main/webapp");  
        webAppContext.setDisplayName("Jetty");  
        webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());  
        webAppContext.setConfigurationDiscovered(true);  
        webAppContext.setParentLoaderPriority(true);  

        try {
            server.setHandler(webAppContext);  
            server.start();
            logger.info("server is  start, port is "+port+"............");  
            
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
	
	
	
}
