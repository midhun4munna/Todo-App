package com.example.demo.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TodoDAO;
import com.example.demo.model.ToDoModel;

@Transactional
@Service
public class ToDoService {

	@Autowired
	private TodoDAO todoDAO;

	public void create(ToDoModel todo) {
		todoDAO.create(todo);
	}
	
	public void remove(int slno) {
		todoDAO.delete(slno);
	}
	
	public List<ToDoModel> getAll(){
		return todoDAO.getAll();
	}
	
	public TodoDAO getTodoDAO() {
		return todoDAO;
	}

	public void setTodoDAO(TodoDAO todoDAO) {
		this.todoDAO = todoDAO;
	}
	

}
