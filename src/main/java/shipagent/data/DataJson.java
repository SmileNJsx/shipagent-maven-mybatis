package shipagent.data;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSON;

import shipagent.dao.User;
import shipagent.db.BuildSqlFactory;

public class DataJson {
	
	public static void main(String[] args) throws IOException{
		
		BuildSqlFactory.initSqlSessionFactory();
		
		SqlSession session = BuildSqlFactory.sqlSessionFactory.openSession();
		
		try{
			User user = (User) session.selectOne("mapping.UserMapper.getUser",1);
			
			String jsonString = JSON.toJSONString(user);
			
			System.out.println(jsonString);
			
		}finally{
			session.close();
		}
	}
}
