package com.example.learn_springboot.repository;

import com.example.learn_springboot.model.OrganizationBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<OrganizationBean, String> {

}