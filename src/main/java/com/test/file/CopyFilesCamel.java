package com.test.file;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class CopyFilesCamel {

	public static void main(String[] args) {
		DefaultCamelContext context = new DefaultCamelContext();
		/*try {
			context.addRoutes(new RouteBuilder() {
				
				@Override
				public void configure() throws Exception {
					from("file:data/input?delete=true").process(new FileProcessor()).to("file:data/output");
					
				}
			});
			context.start();
			Thread.sleep(5000);
			context.stop();
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}*/
		try {
			context.addRoutes(new FileRouter());
			context.start();
			Thread.sleep(5000);
			context.stop();
		} catch (Exception e) {
			System.out.println("Exception is: "+e);
			e.printStackTrace();
		}
	}
}
