package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.FINALBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FINALRepository extends JpaRepository<FINALBean, Long>{

}
