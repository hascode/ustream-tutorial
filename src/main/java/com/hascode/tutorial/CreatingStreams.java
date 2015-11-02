package com.hascode.tutorial;

import static io.github.benas.ustream.Predicates.contains;
import static io.github.benas.ustream.UStream.stdOut;

import java.util.stream.Stream;

import io.github.benas.ustream.UStream;
import io.github.benas.ustream.components.WordCount.Option;

public class CreatingStreams {

	public static void main(String[] args) throws Exception {
		System.out.println("1) Reading project's pom.xml using cat, reducing with head and tail");
		UStream.cat("/data/project/ustream-tutorial/pom.xml").head(6).tail(3).expand().to(stdOut());

		System.out.println("2) Concatenating two streams");
		UStream.concat(Stream.of("foo", "bar"), Stream.of("baz", "baez")).sort().nl().to(stdOut());

		System.out.println("3) Creating stream with current date");
		UStream.date().to(stdOut());

		System.out.println("4) Creating stream with echo");
		UStream.echo("uno\tdue\ttres").expand().to(stdOut());

		System.out.println("5) Creating stream from given stream");
		UStream.from(Stream.of("foo bar baz")).wc(Option.W).to(stdOut());

		System.out.println("6) Creating stream from directory contents using ls");
		UStream.ls().grep("xml").to(stdOut());

		System.out.println("6) Creating stream with absolute path of current directory");
		UStream.pwd().cut("/", 4).to(stdOut());

		System.out.println("7) Creating stream from existing stream with unixify");
		UStream.unixify(Stream.of("foo", "bar", "baz")).exclude(contains("ar")).to(stdOut());
	}

}
