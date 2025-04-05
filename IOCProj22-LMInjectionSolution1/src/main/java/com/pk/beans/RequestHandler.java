package com.pk.beans;

public class RequestHandler {
	private static int count;
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler 0-param constructor");
	}
	public void handle(String data) {
		System.out.println("Handling request "+count+" with data "+data);
	}

}
