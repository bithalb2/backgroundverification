package com.cg.backgroundverification.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cg.backgroundverification.dto.EmployeeDocumentDto;
import com.cg.backgroundverification.dto.LoginDto;
import com.cg.backgroundverification.service.BgvService;
import com.cg.backgroundverification.service.EmployeeDocumentService;
import com.cg.backgroundverification.service.LoginService;

@Controller
public class BackgroundVerificationController {
	
	List<MultipartFile> multipartFiles = new ArrayList<>();
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	EmployeeDocumentService employeeDocumentService;
	
	@Autowired
	BgvService bgvService;
	
	@GetMapping(path = "/login")
	public String showLogin(Model model) {
		model.addAttribute("loginDto", new LoginDto());
		return "login";
	}

	
	  @PostMapping(path = "/login")
	  public String login(@ModelAttribute LoginDto loginDto) {
		  loginDto = loginService.login(loginDto);
		  return "dashboard";
	  }
	 
//	
//	@PostMapping(path = "/uploadDocument")
//	public List<String> uploadDocumentDetails(@RequestParam("files") EmployeeDocumentDto employeeDocumentDto) throws IOException {
//		employeeDocumentService.uploadDocument(employeeDocumentDto);
//		return null;
//	}
//	
//	@PostMapping(path = "/storeDocument")
//	public String documentUpload(@RequestParam("file") MultipartFile file) {
//		multipartFiles.add(file);
//		return "redirect:/uploadDocument";
//	}
}
