package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public Object hello() {
		return service.findById(1L);
	}
	
	@RequestMapping("/update")
	public Object update() {
		service.updateSexById(1L, "男");
		return service.findById(1L);
	}
}
