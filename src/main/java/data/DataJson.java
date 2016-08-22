package data;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import dao.User;
import db.BuildSqlFactory;

public class DataJson {
	
	public static void main(String[] args) throws IOException{
		
		BuildSqlFactory.initSqlSessionFactory();
		
		SqlSession session = BuildSqlFactory.sqlSessionFactory.openSession();
		
		try{
			User user = (User) session.selectOne("mapping.UserMapper.getUser",1);
			
			System.out.println(user.getName()+user.getAge()+user.getId());
			
		}finally{
			session.close();
		}
	}
}
