package com.kosmos.common.dao;


import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosmos.board.vo.KosmosBoardVO;
import com.kosmos.member.student.vo.KosmosMemberVO;
import com.kosmos.member.teacher.vo.KosmosTeacherVO;
import com.kosmos.rboard.vo.KosmosRboardVO;


@Repository
public class ChabunDAOImpl implements ChabunDAO {
	private Logger logger = Logger.getLogger(ChabunDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	@Override
	public KosmosMemberVO getMemChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl getMemChabun >>> : ");
		return sqlSession.selectOne("getMemChabun");
	}
	@Override	
	public KosmosTeacherVO getTeacherChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl getTeacherChabun >>> : ");
		return sqlSession.selectOne("getTeacherChabun");
	}	
	@Override
	public KosmosBoardVO getBoardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl getBoardChabun >>> : ");
		return sqlSession.selectOne("getBoardChabun");
	}

	@Override
	public KosmosRboardVO getRboardChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunDAOImpl getRboardChabun >>> : ");
		return sqlSession.selectOne("getRboardChabun");
	}
}

