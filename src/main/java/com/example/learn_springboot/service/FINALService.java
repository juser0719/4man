package com.example.learn_springboot.service;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.repository.FINALRepository;
import com.example.learn_springboot.repository.ShareDao;
import com.example.learn_springboot.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FINALService{
    @Autowired
    private FINALRepository repository;

    @Autowired
    private ShareDao dao;

    @Autowired
	private CommonUtil commonUtil;



    public Object getList(Object dataMap) {
		String sqlMapId = "custom.list";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", repository.findAll());

		return resultObject;
	}

	public Object getObjectid(Object dataMap) {
		String sqlMapId = "custom.id";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String sqlMapId = "custom.insert";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object updateObject(Map<String, Object> dataMap) {
        String sqlMapId = "custom.update";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "custom.delete";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;
	}
}