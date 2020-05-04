package com.moon.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.moon.domain.UserVO;
import com.moon.dto.LoginDTO;
import com.moon.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	@Inject
	private UserDAO dao;

	@Override
	public UserVO login(LoginDTO dto) throws Exception {		
		return dao.login(dto);
	}
}
