package th.in.sit.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import th.in.sit.user.service.domain.User;
import th.in.sit.user.service.repository.UserRepository;
import th.in.sit.user.service.response.CommonResponse;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public CommonResponse test() {
		CommonResponse response = new CommonResponse();
		response.setSuccess(true);
		response.setMessage("Test");
		return response;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> findAllUser(){
		 List<User> user = userRepo.findAll();
		 return user;
	}
}
