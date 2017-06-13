package com.zhao.webservice;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImplService factory=new HelloWorldImplService();
		HelloWorld helloWorld=factory.getHelloWorldImplPort();
		helloWorld.say("dog12");
		
	}

}
