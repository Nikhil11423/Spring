package com.xworkz.spring.fw.bean.framephoto;

public class FrameBean {
	private String typeOfMeterial;
	private double price;
	private PhotoBean photoBean;

	public FrameBean() {
	}

	/**
	 * @param typeOfMeterial the typeOfMeterial to set
	 */
	public void setTypeOfMeterial(String typeOfMeterial) {
		this.typeOfMeterial = typeOfMeterial;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param photoBean the photoBean to set
	 */
	public void setPhotoBean(PhotoBean photoBean) {
		this.photoBean = photoBean;
	}

	@Override
	public String toString() {
		return "FrameBean [typeOfMeterial=" + typeOfMeterial + ", price=" + price + ", " + photoBean + "]";
	}

}
