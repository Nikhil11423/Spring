package com.xworkz.springfw.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
	public class WaterBottleBean {
		private String brand;
		private String brandFounder;
		private int established;
		private String bottleType;
		private String meterialType;
		private String color;
		private boolean bottleCap;
		private String capColor;
		private int quantity;
		private boolean quality;
		private double price;
		private int bestBeforeInMonths;
		private double rating;
		private boolean filterWater;

		public WaterBottleBean() {
			// TODO Auto-generated constructor stub
		}

		@Value("Bisleri")
		public void setBrand(String brand) {
			this.brand = brand;
		}

		@Value("Ramesh Chauhan")
		public void setBrandFounder(String brandFounder) {
			this.brandFounder = brandFounder;
		}

		@Value("1984")
		public void setEstablished(int established) {
			this.established = established;
		}

		@Value("Cylinder")
		public void setBottleType(String bottleType) {
			this.bottleType = bottleType;
		}

		@Value("plastic")
		public void setMeterialType(String meterialType) {
			this.meterialType = meterialType;
		}

		@Value("blue")
		public void setColor(String color) {
			this.color = color;
		}

		@Value("true")
		public void setBottleCap(boolean bottleCap) {
			this.bottleCap = bottleCap;
		}

		@Value("blue")
		public void setCapColor(String capColor) {
			this.capColor = capColor;
		}

		@Value("1")
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Value("true")
		public void setQuality(boolean quality) {
			this.quality = quality;
		}

		@Value("20.0")
		public void setPrice(double price) {
			this.price = price;
		}

		@Value("6")
		public void setBestBeforeInMonths(int bestBeforeInMonths) {
			this.bestBeforeInMonths = bestBeforeInMonths;
		}

		@Value("4.0")
		public void setRating(double rating) {
			this.rating = rating;
		}

		@Value("true")
		public void setFilterWater(boolean filterWater) {
			this.filterWater = filterWater;
		}

		@Override
		public String toString() {
			return "WaterBottleBean [brand=" + brand + ", brandFounder=" + brandFounder + ", established=" + established
					+ ", bottleType=" + bottleType + ", meterialType=" + meterialType + ", color=" + color + ", bottleCap="
					+ bottleCap + ", capColor=" + capColor + ", quantity=" + quantity + ", quality=" + quality + ", price="
					+ price + ", bestBeforeInMonths=" + bestBeforeInMonths + ", rating=" + rating + ", filterWater="
					+ filterWater + "]";
		}

	}


