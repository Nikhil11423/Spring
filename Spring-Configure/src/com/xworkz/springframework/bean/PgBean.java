package com.xworkz.springframework.bean;

import org.springframework.beans.factory.annotation.Value;

public class PgBean {

	private Integer id;
	private String name;
	private String ownerName;
	private String location;
	private Integer totalRooms;
	private Double price;
	private boolean wifi;
	private boolean clean;
	private long mobNo;
	private String email;
	private boolean foodQuality;
	private double twoSharingPrice;
	private double threeSharingPrice;
	private double fourSharingPrice;
	private boolean nearBusStop;

	public PgBean(@Value("1") Integer id, @Value("Vivek PG") String name, @Value("Kiran Reddy") String ownerName,
			@Value("Tavarekere") String location, @Value("45") Integer totalRooms, @Value("6000.0") Double price,
			@Value("true") boolean wifi, @Value("flase") boolean clean, @Value("7204750578") long mobNo,
			@Value("reddy@gmail.com") String email, @Value("flase") boolean foodQuality,
			@Value("6000.0") double twoSharingPrice, @Value("5000.0") double threeSharingPrice,
			@Value("4500.0") double fourSharingPrice, @Value("true") boolean nearBusStop) {
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.totalRooms = totalRooms;
		this.price = price;
		this.wifi = wifi;
		this.clean = clean;
		this.mobNo = mobNo;
		this.email = email;
		this.foodQuality = foodQuality;
		this.twoSharingPrice = twoSharingPrice;
		this.threeSharingPrice = threeSharingPrice;
		this.fourSharingPrice = fourSharingPrice;
		this.nearBusStop = nearBusStop;
	}

	@Override
	public String toString() {
		return "PgBean [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", location=" + location
				+ ", totalRooms=" + totalRooms + ", price=" + price + ", wifi=" + wifi + ", clean=" + clean + ", mobNo="
				+ mobNo + ", email=" + email + ", foodQuality=" + foodQuality + ", twoSharingPrice=" + twoSharingPrice
				+ ", threeSharingPrice=" + threeSharingPrice + ", fourSharingPrice=" + fourSharingPrice
				+ ", nearBusStop=" + nearBusStop + "]";
	}

}
