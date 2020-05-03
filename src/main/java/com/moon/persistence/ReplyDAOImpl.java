package com.moon.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.moon.domain.Criteria;
import com.moon.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.moon.mapper.ReplyMapper";
	
	@Override
	public List<ReplyVO> list(Integer bno) throws Exception {		
		return session.selectList(namespace+".list",bno);
	}

	@Override
	public void create(ReplyVO vo) throws Exception {
		session.insert(namespace+".create",vo);
	}

	@Override
	public void update(ReplyVO vo) throws Exception {
		session.update(namespace+".update",vo);
		
	}

	@Override
	public void delete(Integer rno) throws Exception {
		session.delete(namespace+".delete",rno);
		
	}

	@Override
	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception {
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("bno", bno);
		paramMap.put("cri", cri);
		return session.selectList(namespace+".listPage",paramMap);
	}

	@Override
	public int count(Integer bno) throws Exception {
		return session.selectOne(namespace+".count", bno);
	}

	@Override
	public void updateReplyCnt(Integer bno, int amount) throws Exception {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		
		paramMap.put("bno", bno);
		paramMap.put("amount", amount);
		
		session.update(namespace+".updateReplyCnt", paramMap);
	}

	@Override
	public int getBno(Integer rno) throws Exception {
		return session.selectOne(namespace+".getBno",rno);
	}

}
