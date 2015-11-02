package com.hascode.tutorial;

import static io.github.benas.ustream.UStream.stdOut;

import io.github.benas.ustream.UStream;

public class Example2 {

	public static void main(String[] args) throws Exception {
		UStream.ls("/data/project/ustream-tutorial").sort().tail(4).lowercase().trim().to(stdOut());
	}

}
