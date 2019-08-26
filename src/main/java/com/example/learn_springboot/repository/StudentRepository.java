package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.StudentBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentBean, Long> {

}