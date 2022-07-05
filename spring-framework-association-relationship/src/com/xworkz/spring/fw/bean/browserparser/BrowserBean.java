package com.xworkz.spring.fw.bean.browserparser;

public class BrowserBean {

	private String nameOfBrowser;
	private ParserBean parserBean;

	public BrowserBean(String nameOfBrowser, ParserBean parserBean) {
		this.nameOfBrowser = nameOfBrowser;
		this.parserBean = parserBean;
	}

	@Override
	public String toString() {
		return "BrowserBean [nameOfBrowser=" + nameOfBrowser + ", " + parserBean + "]";
	}

}
