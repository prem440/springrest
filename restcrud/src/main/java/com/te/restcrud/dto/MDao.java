package com.te.restcrud.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MDao {
	@Id
	private int serial_no;
	private long imei;
	private String brand;
	private String name;
	private String battery;

}