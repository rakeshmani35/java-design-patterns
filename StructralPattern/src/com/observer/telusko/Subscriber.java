package com.observer.telusko;

public class Subscriber {

	// every subscriber has a name
	private String subsName;

	// subscriber subscriber the channel
	private Channel channel = new Channel();

	public Subscriber(String subsName) {
		this.subsName = subsName;
	}
	
	// subscriber want to know when channel going to upload a video
	public void upload() {
		System.out.println("Hey "+subsName+", video uploaded..."+channel.videoTtile);
	}
	
	// subscriber should know which channel going to subscribe
	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
}
