package com.hascode.tutorial;

import static io.github.benas.ustream.UStream.stdOut;

import java.io.IOException;
import java.util.stream.Stream;

import io.github.benas.ustream.UStream;

public class Example1 {

	public static void main(String[] args) throws IOException {
		Stream<String> stream = Stream.of("foo", "bar", "bar", "baz");
		UStream.unixify(stream).grep("a").sort().uniq().nl().to(stdOut());
	}

}
