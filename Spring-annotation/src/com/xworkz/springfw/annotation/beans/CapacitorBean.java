package com.xworkz.springfw.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class CapacitorBean {

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


	public CapacitorBean(@Value("Capacitor") String type, @Value("2mf") String value,
			@Value("MIL-PRF-34667") String series, @Value("bluk") String package1,@Value("44") Byte voltage,
			@Value("-55`c~125`c") String temperature, @Value("Through Hole") String mountingType,
			@Value("High Reliability") String features, @Value("M49000/01") String baseProductNumber,@Value("1200") Integer quantity, @Value("true") String status,
			@Value("0.01d") Double failureRate, @Value("false") Boolean rohs) {

		this.type = type;
		this.value = value;
		this.series = series;
		this.Package = package1;
		this.Status = status;
		this.voltage = voltage;
		this.Temperature = temperature;
		this.mountingType = mountingType;
		this.Features = features;
		this.baseProductNumber = baseProductNumber;
		this.quantity = quantity;
		this.Status = status;
		this.failureRate = failureRate;
		this.rohs = rohs;
	}

	@Override
	public String toString() {
		return "CapacitorBean [type=" + type + ", value=" + value + ", quantity=" + quantity + ", series=" + series
				+ ", Package=" + Package + ", Status=" + Status + ", voltage=" + voltage + ", Temperature="
				+ Temperature + ", mountingType=" + mountingType + ", Features=" + Features + ", failureRate="
				+ failureRate + ", baseProductNumber=" + baseProductNumber + ", rohs=" + rohs + "]";
	}

}
