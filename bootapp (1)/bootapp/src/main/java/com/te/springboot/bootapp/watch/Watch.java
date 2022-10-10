package com.te.springboot.bootapp.watch;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class Watch {
	@Id
	private int wid;
	private String brand;
	private int quantity;
	private String type;
	private long price;
	

}
