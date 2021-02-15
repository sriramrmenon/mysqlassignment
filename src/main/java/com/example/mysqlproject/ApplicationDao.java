package com.example.mysqlproject;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicationDao extends CrudRepository<RequestData,Integer> {


//    @Query(value = "SELECT reqData FROM RequestData reqData where reqData.id=?1", nativeQuery = true)
//    List<RequestData> findResource(Integer id);
}
