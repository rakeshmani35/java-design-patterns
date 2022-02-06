package com.observer.telusko;

public class YoutubeChannel {

	public static void main(String[] args) {


		Channel telusko = new Channel();

		Subscriber s1 = new Subscriber("Akshay");
		Subscriber s2 = new Subscriber("Sonam");
		Subscriber s3 = new Subscriber("Harsh");
		Subscriber s4 = new Subscriber("Kiran");
		Subscriber s5 = new Subscriber("Pravin");
		
		// add subscriber to channel
		telusko.subscribeChennal(s1);
		telusko.subscribeChennal(s2);
		telusko.subscribeChennal(s3);
		telusko.subscribeChennal(s4);
		telusko.subscribeChennal(s5);
		
		// subscriber should know which channel subscribing
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
		
		telusko.uploadByChannel("how to learn programming ??");
	}

}
