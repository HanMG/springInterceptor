package com.moon.persistence;

import com.moon.domain.UserVO;
import com.moon.dto.LoginDTO;

public interface UserDAO {
	public UserVO login(LoginDTO dto) throws Exception;
}
