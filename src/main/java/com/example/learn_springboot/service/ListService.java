package com.example.learn_springboot.service;

import java.util.HashMap;
import java.util.Map;


import com.example.learn_springboot.repository.ListRepository;
import com.example.learn_springboot.repository.ShareDao;
import com.example.learn_springboot.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListService {

    @Autowired
    private ShareDao dao;

    @Autowired
	private CommonUtil commonUtil;

	@Autowired
	private ListRepository list_repository;

    public Object getList(Object dataMap) {
		String sqlMapId = "list.list";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", list_repository.findAll());

		return resultObject;
	}

	public Object getObjectid(Object dataMap) {
		String sqlMapId = "list.id";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String sqlMapId = "list.insert";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object updateObject(Map<String, Object> dataMap) {
        String sqlMapId = "list.update";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "list.delete";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;
	}
}