package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.FinalBean;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalRepository extends JpaRepository<FinalBean, String> {

}