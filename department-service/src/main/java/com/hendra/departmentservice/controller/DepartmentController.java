package com.hendra.departmentservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

//import com.hendra.departmentservice.entity.Department;
//import com.hendra.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	protected static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	@PostMapping("/")
	public String savePost() {
		return "savePost";
	}

	@GetMapping("/{id}")
	public String getMapping(@PathVariable("id") long id) {
		logger.info("Enter Department with ID");
		return id + "\tcoba";
	}

//	@Autowired
//	private DepartmentService departmentService;
//	
//	@PostMapping("/")
//	public Department saveDepartment(@RequestBody Department department) {
//		return departmentService.saveDepartment(department);
//	}
//	
//	@GetMapping("/{id}")
//	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
//		return departmentService.findDepartmentById(departmentId);
//	}
}
