package com.xworkz.spring.fw.bean.fishtail;

public class FishesBean {

	private String fishName;
	private String typeOfWater;
	private TailBean tailBean;

	public FishesBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fishName the fishName to set
	 */
	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

	/**
	 * @param typeOfWater the typeOfWater to set
	 */
	public void setTypeOfWater(String typeOfWater) {
		this.typeOfWater = typeOfWater;
	}

	/**
	 * @param tailBean the tailBean to set
	 */
	public void setTailBean(TailBean tailBean) {
		this.tailBean = tailBean;
	}

	@Override
	public String toString() {
		return "FishBean [fishName=" + fishName + ", typeOfWater=" + typeOfWater + ", " + tailBean + "]";
	}

}
