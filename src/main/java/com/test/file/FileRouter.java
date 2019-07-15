package com.test.file;

import org.apache.camel.builder.RouteBuilder;

public class FileRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:data/input?delete=true").process(new FileProcessor()).to("file:data/output");

	}

}
