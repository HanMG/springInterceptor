package com.moon.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.moon.domain.UserVO;
import com.moon.dto.LoginDTO;

@Repository
public class UserDAOImpl implements UserDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.moon.mapper.UserMapper";
	
	@Override
	public UserVO login(LoginDTO dto) throws Exception{
		return session.selectOne(namespace+".login", dto);
	}
}
