package com.example.learn_springboot.service;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.repository.ItemRepository;
import com.example.learn_springboot.repository.ShareDao;
import com.example.learn_springboot.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ShareDao dao;

    @Autowired
	private CommonUtil commonUtil;
	
	@Autowired
	private ItemRepository itemrepository;
	
    public Object getList(Object dataMap) {
		String sqlMapId = "item.list";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", itemrepository.findAll());

		return resultObject;
	}

	public Object getObjectid(Object dataMap) {
		String sqlMapId = "item.id";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String sqlMapId = "item.insert";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object updateObject(Map<String, Object> dataMap) {
        String sqlMapId = "item.update";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "item.delete";

		Object resultObject = dao.saveObject(sqlMapId, dataMap);

		return resultObject;
	}
}