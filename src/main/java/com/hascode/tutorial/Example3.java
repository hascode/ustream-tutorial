package com.hascode.tutorial;

import static io.github.benas.ustream.UStream.stdOut;

import io.github.benas.ustream.UStream;

public class Example3 {

	public static void main(String[] args) throws Exception {
		String input = "This is a tezt of\r\nsome text written using\r\nms-style line separators.";
		UStream.echo(input).dos2unix().tr("tezt", "test").to(stdOut());
	}

}
