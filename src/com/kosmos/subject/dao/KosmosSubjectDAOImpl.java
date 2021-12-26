package com.kosmos.subject.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kosmos.subject.vo.KosmosSubjectVO;

@Repository
public class KosmosSubjectDAOImpl implements KosmosSubjectDAO {
	private Logger logger = Logger.getLogger(KosmosSubjectDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	@Override
	public List<KosmosSubjectVO> subjectSelectAll(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectSelectAll() >>> : ");
		return sqlSession.selectList("subjectSelectAll", svo);
	}
	
	@Override
	public List<KosmosSubjectVO> subjectSelect(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectSelect() >>> : ");
		return sqlSession.selectList("subjectSelect", svo);
	}

	@Override
	public int subjectInsert(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectInsert() >>> : ");
		return (Integer)sqlSession.insert("subjectInsert", svo);
	}

	@Override
	public int subjectUpdate(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectUpdate() >>> : ");
		return (Integer)sqlSession.update("subjectUpdate", svo);
	}

	@Override
	public int subjectDelete(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectDelete() >>> : ");
		return (Integer)sqlSession.delete("subjectDelete", svo);
	}

	@Override
	public List<KosmosSubjectVO> beforeNameList() {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : beforeNameList() >>> : ");
		return sqlSession.selectList("beforeNameList");
	}

	@Override
	public KosmosSubjectVO subjectChabun(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : beforeNameList() >>> : ");
		return sqlSession.selectOne("subjectChabun", svo);
	}

	@Override
	public KosmosSubjectVO subjectCallCode(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectCallCode() >>> : ");
		return sqlSession.selectOne("subjectCallCode", svo);
	}

	@Override
	public List<KosmosSubjectVO> subjectSelectEssential(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectSelectEssential() >>> : ");
		return sqlSession.selectList("subjectSelectEssential", svo);
	}

	@Override
	public List<KosmosSubjectVO> subjectSelectChoice(KosmosSubjectVO svo) {
		// TODO Auto-generated method stub
		logger.info("KosmosSubjectDAOImpl : subjectSelectChoice() >>> : ");
		return sqlSession.selectList("subjectSelectChoice", svo);
	}

	
}
