package com.te.springboot.bootapp.wservice.impl;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.te.springboot.bootapp.repo.WatchRepo;
import com.te.springboot.bootapp.service.WService;
import com.te.springboot.bootapp.watch.Watch;

import net.bytebuddy.implementation.bytecode.Throw;

@Repository
public class WatchC implements WService {
	@Autowired
	WatchRepo wrpo;

	@Override
	public Watch addwatch(Watch wtch) {
		Watch save = wrpo.save(wtch);
		return save;

	}

	@Override
	public Optional<Watch> getwatch(int wid) {
		Optional<Watch> byId = wrpo.findById(wid);
		if (byId.isPresent()) {
			return byId;
		} else {
			throw new RuntimeException("sorry go home");
		}

	}

}
