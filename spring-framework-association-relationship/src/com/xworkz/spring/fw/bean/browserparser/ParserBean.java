package com.xworkz.spring.fw.bean.browserparser;

public class ParserBean {

	private String typeOfParser;

	public ParserBean(String typeOfParser) {
		this.typeOfParser = typeOfParser;
	}

	@Override
	public String toString() {
		return "typeOfParser=" + typeOfParser + "";
	}

}
