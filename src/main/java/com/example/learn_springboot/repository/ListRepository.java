package com.example.learn_springboot.repository;



import com.example.learn_springboot.model.ListBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListRepository extends JpaRepository<ListBean, Long> {

}
