package com.demoapp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demoapp.entity.User;
import com.demoapp.repo.UserRepo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/add")
	public String dispalyAddUser(Model model) {
		model.addAttribute("user",new User());
		return "add-user";
		
	}
	
	@PostMapping("/save")
	public String saveUser(Model model,@ModelAttribute User user) {

		model.addAttribute("message","User "+user.getFirstName() +" created successfully");
		userRepo.save(user);
		List<User> users = userRepo.findAll();
		model.addAttribute("users",users);
		return "user-list";
	}

	@GetMapping("/list")
	public String listUser(Model model) {
		List<User> users = userRepo.findAll();
		if(users.isEmpty())
			model.addAttribute("message","No record found");
		
		model.addAttribute("users",users);
		return "user-list";
	}
	
	@GetMapping("user-detail")
	public String userDetail(Model model,@PathParam(value = "email") String email) {
		User user = userRepo.findByEmail(email);
		model.addAttribute("user",user);
		return "user-detail";
	}

	@PostMapping("/update")
	public String updateUser(Model model,@ModelAttribute User user) {

		model.addAttribute("message","User "+user.getFirstName() +" updated successfully");
		userRepo.save(user);
		List<User> users = userRepo.findAll();
		model.addAttribute("users",users);
		return "user-list";
	}

}
