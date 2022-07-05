package com.xworkz.spring.fw.bean.framephoto;

public class PhotoBean {

	private String sizeofPhoto;
	private int numberOfPhoto;

	public PhotoBean() {
		System.out.println("create photoBean");
	}

	/**
	 * @param sizeofPhoto the sizeofPhoto to set
	 */
	public void setSizeofPhoto(String sizeofPhoto) {
		this.sizeofPhoto = sizeofPhoto;
	}

	/**
	 * @param numberOfPhoto the numberOfPhoto to set
	 */
	public void setNumberOfPhoto(int numberOfPhoto) {
		this.numberOfPhoto = numberOfPhoto;
	}

	@Override
	public String toString() {
		return "sizeofPhoto=" + sizeofPhoto + ", numberOfPhoto=" + numberOfPhoto + "";
	}

}
