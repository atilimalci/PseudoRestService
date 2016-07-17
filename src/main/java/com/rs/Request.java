package com.rs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Request {

	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Request [text=" + text + "]";
	}
}
