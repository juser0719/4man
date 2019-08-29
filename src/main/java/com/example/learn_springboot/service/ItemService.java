package com.example.learn_springboot.service;

import com.example.learn_springboot.repository.ShareDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ShareDao dao;

	public Object getObjectinfo(Object dataMap) {
		String sqlMapId = "item.read";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}
}