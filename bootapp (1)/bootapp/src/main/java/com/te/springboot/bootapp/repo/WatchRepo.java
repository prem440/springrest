package com.te.springboot.bootapp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.springboot.bootapp.watch.Watch;

@Repository
public interface WatchRepo extends CrudRepository<Watch,Integer> {

}
