package com.cj.myapp;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cj.dto.SampleDTO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MybatisTest {
	private static final Logger logger = LoggerFactory.getLogger(MybatisTest.class);
	
	@Inject
    private SqlSessionFactory sqlFactory;
	
	@Inject
	SqlSession sqlSession;
    
    @Test
    public void testFactory(){
        logger.info("sqlFactory : "+sqlFactory);
    }
    
    @Test
    public void testSession() throws Exception{
        
        try(SqlSession session = sqlFactory.openSession()){           
            logger.info("MyBatis Connection success! session  : "+session);           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void test2() {
    	List<SampleDTO> list = sqlSession.selectList("sample.sampleList");
    	for(SampleDTO sample : list) {
    		logger.info(sample.toString());
    	}
    }
}
