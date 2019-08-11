//package com.dev.repo;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
//import com.dev.beans.Student;
//
//
//public class Database {
//	public Map<Integer,Student>map;
//	public  Database(){
//		map=new HashMap<>();
//		Student s1=new Student();
//		//first student data
//		s1.setId(1);
//		s1.setName("priya");
//		s1.setEmail("priya@gmail.com");
//		s1.setPassword("priya");
//		map.put(s1.getId(), s1);
//		map.get(s1);
//		//2nd student data
//		Student s2=new Student();
//		s2.setId(2);
//		s2.setName("retriever");
//		s2.setEmail("retrive@gmail.com");
//		s2.setPassword("golden");
//		map.put(s2.getId(), s2);
//		map.get(s2);
//    
//}
//
//
//}

package com.dev.repo;

import java.util.HashMap;
import java.util.Map;

import com.dev.beans.Student;

public class Database {
	
	
	
	public Map<Integer,Student> map= new HashMap<Integer,Student>();
	
	public Database() {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("priya");
		s1.setPassword("priyas");
		s1.setEmail("priya@gmail.com");
		map.put(s1.getId(), s1);
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("vamshi");
		s2.setPassword("vamshi1");
		s2.setEmail("vamshi@gmail.com");
		map.put(s2.getId(), s2);
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("husky");
		s3.setPassword("husky1");
		s3.setEmail("husky@gmail.com");
		map.put(s3.getId(), s3);
		Student s4 = new Student();
		s4.setId(4);
		s4.setName("retriever");
		s4.setPassword("gold");
		s4.setEmail("retrieve@gmail.com");
		map.put(s4.getId(), s4);
		Student s5 = new Student();
		s5.setId(5);
		s5.setName("suresh");
		s5.setPassword("su123");
		s5.setEmail("spriya@gmail.com");
		map.put(s5.getId(), s5);
	}
}



