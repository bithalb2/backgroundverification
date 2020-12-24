package com.cg.backgroundverification.service.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.backgroundverification.dto.LoginDto;
import com.cg.backgroundverification.model.Login;
import com.cg.backgroundverification.repository.LoginRepository;
import com.cg.backgroundverification.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public LoginDto login(LoginDto loginDto) {
		
		try {
			Login login = loginRepository.getOne(loginDto.getEmpId());
			
				if(login.getPassword().equals(loginDto.getPassword()) &&
						login.getRoleMaster().getRoleId() == loginDto.getRoleId()) {
					return loginDto;
				} else {
					return null;
				}
			} catch(EntityNotFoundException e) {
				e.printStackTrace();
				return null;
			}
	}

}
