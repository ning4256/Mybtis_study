package com.ning4256.base;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ning4256.pojo.StudentPo;

/*
 * Mybatis框架：是一个非常优秀的对JDBC进行了封装的框架
 * 
 * 1.引入mybatis所需要的包
 * mybatis-3.2.7.jar				Mybatis框架的核心包
 * mysql-connector-java-5.1.30.jar	操作数据库的包
 * 
 * 对mybatis支持的包
 * asm 								java字节码操作包
 * cglib							cglib代理包，来动态创建代理
 * commons-logging					通用日志包
 * javassist						java助手，处理字节码的
 * log4j							mybatis所需要的日志包
 * slf4j							日志包
 * 
 * 2.将包添加到构建路径
 * 
 * 3.准备数据库构建工具
 * 
 * 4.在src创建mybatis的配置文件
 * 
 * 5.创建一个实体类(POJO)与数据库操作对应
 * 
 * 6.创建POJO类与表对应的mapper(映射文件),指定类中属性与表中字段的映射
 * 
 *  
 * 
 * */


public class Base {
	public static void main(String[] args) {
		//1.使用mybatis操作数据库
		
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 2.创建回话对象 操作数据库
		SqlSession session = sqlSessionFactory.openSession();

		//3.执行sql 参数：命名空间.id
//		List<StudentPo> list = session.selectList("abc.selectAll");	
//		System.out.println(list.toString());
//		//关闭资源
////		session.close();
		
//		//获得指定id的学生信息
//		StudentPo s1 = new StudentPo();
//		s1.setsid(10);
//		StudentPo s = session.selectOne("abc.selectOne", s1);
//		System.out.println(s.toString());
		
		//以id和name查询指定的学生
		//传一个map
//		StudentPo s2 = new StudentPo();
//		s2.setsid(1);
//		s2.setsname("伍川");
//		StudentPo s = session.selectOne("abc.selectByObj", s2);
//		System.out.println(s);
		
		//模糊查询 like %伍% %不能写在sql里面，只能穿过去
//		List<StudentPo> list = session.selectList("abc.selectByLike", "%伍%");
//		System.out.println(list);
		
//		//分页查询
//		Map<String, Object> map = new HashMap<>();
//		map.put("index", 0);
//		map.put("count", 3);
//		List<StudentPo> list = session.selectList("abc.selectByLimit", map);
//		System.out.println(list);
		
//		//聚合函数
//		List<StudentPo> list = session.selectList("abc.selectCount");
//		System.out.println(list);
		
		//根据年龄大小查询
		StudentPo s7 = new StudentPo();
		s7.setsage(20);
		List<StudentPo> list = session.selectList("abc.selectLt", s7);
		System.out.println(list);
		
		
//		//插入数据:参数1 命名空间+id, 参数2：插入的数据
//		StudentPo s3 = new StudentPo();
//		s3.setsid(11);
//		s3.setsname("小老弟");
//		s3.setsage(11);
//		int i = session.insert("abc.insertStudent", s3);
//		System.out.println(i);
//		session.commit();
		
//		//根据id更新该学生信息
//		StudentPo s5 = new StudentPo();
//		s5.setsid(25);
//		s5.setsname("伍川小老弟");
//		s5.setsage(11);
//		int k = session.update("abc.updateById", s5);
//		session.commit();
//		System.out.println(k);
		
//		//删除某条数据
//		StudentPo s4 = new StudentPo();
//		s4.setsid(24);
//		int j = session.delete("abc.deleteById", s4);
//		System.out.println(j);
//		session.commit();
		
		//执行sql 参数：命名空间.id
		session.close();

	}
}
