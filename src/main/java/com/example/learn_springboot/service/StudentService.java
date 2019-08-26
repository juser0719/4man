package com.example.learn_springboot.service;

import java.util.HashMap;
import java.util.Map;

import com.example.learn_springboot.repository.StudentRepository;
import com.example.learn_springboot.repository.ShareDao;
import com.example.learn_springboot.util.CommonUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	@Autowired
	private ShareDao dao;

	@Autowired
	private CommonUtil commonUtil;

	public Object getList(Object dataMap) {
		String sqlMapId = "student.list";

		Object resultObject = new HashMap<>();
		// ((Map<String, Object>) resultObject).put("resultList", dao.getList(sqlMapId,
		// dataMap));
		((Map<String, Object>) resultObject).put("resultList", repository.findAll());

		return resultObject;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "student.read";

		Object resultObject = dao.getObject(sqlMapId, dataMap);

		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String uniqueSequence = (String) dataMap.get("ORGANIZATION_SEQ");

		if ("".equals(uniqueSequence)) {
			uniqueSequence = commonUtil.getUniqueSequence();
		}
		dataMap.put("ID", uniqueSequence);

		String sqlMapId = "student.insert";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;
	}

	public Object updateObject(Map<String, Object> dataMap) {
		String sqlMapId = "student.update";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		Object resultObject = this.getObject(dataMap);

		return resultObject;

	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "student.delete";

		Integer resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		Object resultObject = this.getList(dataMap);

		return resultObject;
	}
}