package com.moon.service;

import com.moon.domain.UserVO;
import com.moon.dto.LoginDTO;

public interface UserService {
	public UserVO login(LoginDTO dto) throws Exception;

}
