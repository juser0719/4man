package com.example.learn_springboot.repository;


import com.example.learn_springboot.model.ItemBean;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemBean, Long>{

}
