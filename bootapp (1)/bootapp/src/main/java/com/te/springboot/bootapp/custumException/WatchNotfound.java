package com.te.springboot.bootapp.custumException;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Component
public class WatchNotfound extends RuntimeException{
	public WatchNotfound(String r){
		super(r);
	}
	public WatchNotfound(){
		super();
	}
}
