package com.xworkz.spring.fw.bean.solarsystemplanets;

public class SolarSystemBean {

	private int totalPlanets;
	private String nearestStar;
	private PlanetsBean planetsBean;

	public SolarSystemBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param totalPlanets the totalPlanets to set
	 */
	public void setTotalPlanets(int totalPlanets) {
		this.totalPlanets = totalPlanets;
	}

	/**
	 * @param nearestStar the nearestStar to set
	 */
	public void setNearestStar(String nearestStar) {
		this.nearestStar = nearestStar;
	}

	/**
	 * @param planetsBean the planetsBean to set
	 */
	public void setPlanetsBean(PlanetsBean planetsBean) {
		this.planetsBean = planetsBean;
	}

	@Override
	public String toString() {
		return "SolarSystemBean [totalPlanets=" + totalPlanets + ", nearestStar=" + nearestStar + ", " + planetsBean
				+ "]";
	}

}
