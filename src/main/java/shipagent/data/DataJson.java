package shipagent.data;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.alibaba.fastjson.JSON;

import shipagent.dao.User;
import shipagent.db.BuildSqlFactory;

public class DataJson {
	
	public static void main(String[] args) throws IOException{
		
		BuildSqlFactory.initSqlSessionFactory();
		
		SqlSession session = BuildSqlFactory.sqlSessionFactory.openSession();
		
		try{
			List<User> user = session.selectList("mapping.UserMapper.getUser");
			
			User user1 = user.get(0);
			
			String jsonString = JSON.toJSONString(user1);
			
			System.out.println(jsonString);
			
		}finally{
			session.close();
		}
	}
}
