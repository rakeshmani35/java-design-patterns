package com.observer.telusko;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	// channel should know how many subscriber has
	List<Subscriber> subsList = new ArrayList<Subscriber>();

	// channel upload video with video title
	 String videoTtile;

	// channel knows which subscribe registered for video
	public void subscribeChennal(Subscriber sub) {
		subsList.add(sub);
	}

	// channel knows which subscribe un-registered for video
	public void unSubscribeChennal(Subscriber sub) {
		subsList.remove(sub);
	}

	// notify to subscriber, when channel upload video
	public void notifyToSubscriber() {

		for (Subscriber subscriber : subsList) {
			// call subscriber upload method to send notification to all subscriber who
			// registered with channel
			subscriber.upload();
		}
	}
	
	// upload video by channel with title
	public void uploadByChannel(String videoTitle) {
		this.videoTtile = videoTitle;
		notifyToSubscriber();
	}
}
