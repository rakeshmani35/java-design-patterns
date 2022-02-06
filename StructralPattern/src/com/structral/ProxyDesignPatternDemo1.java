package com.structral;

import java.util.Calendar;

import javax.swing.JOptionPane;

interface ISP {
	public String getResource(String site);
}

class Vodafone implements ISP {

	@Override
	public String getResource(String site) {

		switch (site) {
		case "www.google.com":
			return "GOOOGLEEE";
		case "www.flipkart.com":
			return "Flipkart";
		case "www.amazon.in":
			return "Amazon";

		default:
			return "Sorry no resource found";
		}
	}

}

class InternetProxy implements ISP {

	@Override
	public String getResource(String site) {
		this.logRequest(site);
		if (isBlocked(site)) {
			return "This site : " + site + " is blocked as per company policy";
		}
		NetworkSetting networkSetting = new NetworkSetting();
		return networkSetting.getISP().getResource(site);
	}

	private void logRequest(String site) {
		System.out.println(Calendar.getInstance().getTime() + " Request for " + site);
	}

	private boolean isBlocked(String site) {
		switch (site) {
		case "www.google.com":
			return false;
		case "www.flipkart.com":
			return false;
		case "www.amazon.in":
			return false;
		default:
			return true;
		}
	}
}

class NetworkSetting {

	public ISP getInternet() {
		return new InternetProxy();
	}

	public ISP getISP() {
		return new Vodafone();
	}
}

class Browser {

	public void sendRequest() {
		String site = JOptionPane.showInputDialog("Enter the site URL");
		String response = this.getInternetProvider().getResource(site);
		this.loadResponse(response);
	}

	private void loadResponse(String response) {
		System.out.println(response);
	}

	private ISP getInternetProvider() {
		return new NetworkSetting().getInternet();
	}
}

public class ProxyDesignPatternDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser browser = new Browser();
		browser.sendRequest();
	}

}
