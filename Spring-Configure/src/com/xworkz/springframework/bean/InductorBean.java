package com.xworkz.springframework.bean;

import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;

@ComponentScan(basePackages = "com.xworkz.springframework")
@Setter
@Getter
public class InductorBean {

	

		private String type;
		private String value;
		private Integer quantity;
		private String series;
		private String Package;
		private String Status;
		private Byte voltage;
		private String Temperature;
		private String mountingType;
		private String Features;
		private Double failureRate;
		private String baseProductNumber;
		private Boolean rohs;
		private String usedIn;

		@Override
		public String toString() {
			return "InductorBean [type=" + type + ", value=" + value + ", quantity=" + quantity + ", series=" + series
					+ ", Package=" + Package + ", Status=" + Status + ", voltage=" + voltage + ", Temperature="
					+ Temperature + ", mountingType=" + mountingType + ", Features=" + Features + ", failureRate="
					+ failureRate + ", baseProductNumber=" + baseProductNumber + ", rohs=" + rohs + ", usedIn=" + usedIn
					+ "]";
		}
}
