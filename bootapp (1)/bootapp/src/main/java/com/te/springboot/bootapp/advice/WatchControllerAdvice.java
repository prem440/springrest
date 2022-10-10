package com.te.springboot.bootapp.advice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.springboot.bootapp.custumException.WatchNotfound;
import com.te.springboot.bootapp.watch.Watch;

@RestControllerAdvice
public class WatchControllerAdvice {
	@Autowired
	WatchNotfound wnf;
	@ExceptionHandler(value = WatchNotfound.class)
public WatchNotfound watchnotfoud() {
		
	throw new WatchNotfound("sorry bro");
}
}
