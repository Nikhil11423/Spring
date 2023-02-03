package com.xworkz.freedom.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class PropertiesEntity {

	private String createdBy;
	private LocalDateTime createDateTime;
	private String updatedBy;
	private LocalDateTime updateDateTime;

}
