package com.sonata.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Employee;

//import com.sonata.model.Employee;

@Repository
//@ComponentScan({"com.sonata.controller"})
public interface SampleRepository extends JpaRepository<Employee, Long>{

}
