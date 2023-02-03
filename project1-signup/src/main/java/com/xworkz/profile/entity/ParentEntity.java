package com.xworkz.profile.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class ParentEntity {
	
	private String createdBy;
	private LocalDateTime createdDateTime;
	private String updatedBy;
	private LocalDateTime updatedDateTime;
}
