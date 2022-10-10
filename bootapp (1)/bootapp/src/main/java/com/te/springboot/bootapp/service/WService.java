package com.te.springboot.bootapp.service;

import java.util.Optional;

import com.te.springboot.bootapp.watch.Watch;

public interface WService {
public Watch addwatch(Watch wtch);

public Optional<Watch> getwatch(int wid);


}
