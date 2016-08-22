package db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BuildSqlFactory {
	
	public static SqlSessionFactory sqlSessionFactory;
	
	public static void initSqlSessionFactory() throws IOException{
		String resources = "mybatis-config.xml";
		
		System.out.println(resources);
		
		InputStream inputStream = Resources.getResourceAsStream(resources);
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
}
