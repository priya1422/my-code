package com.project;

import java.util.HashMap;
public class MyFirstProject {
	
public static void main(String[] args) {
	int bookCounter=0;
	
	Books book1=new Books();
	book1.setBookid("123P");
	book1.setBookname("brain on fire");
	book1.setAuthor("susanah chahlan");
	book1.setCategory("Magazine");
	
	Books book2=new Books();
	book2.setBookid("999H");
	book2.setBookname("The elite");
	book2.setAuthor("kiera cass");
	book2.setCategory("fiction");
	
	Books book3=new Books();
	book3.setBookid("342R");
	book3.setBookname("Mindset");
	book3.setAuthor("Carol S.Dweck");
	book3.setCategory("Educational");
	
	Books book4=new Books();
	book4.setBookid("343U");
	book4.setBookname("Worm");
	book4.setAuthor("Wildbow");
	book4.setCategory("Comic");
	
	Books book5=new Books();
	book4.setBookid("376K");
	book4.setBookname("Meta");
	book4.setAuthor("Tom Reynolds");
	book4.setCategory("Comic");

	HashMap<Integer,Books> category=new HashMap<>();
	category.put(1,book1);
	category.put(2,book2);
	category.put(3,book3);
	category.put(4,book4);
	category.put(5,book5);
	Books b=new Books();
	
	System.out.println(Books.magazine);
	System.out.println(Books.fiction);
	System.out.println(Books.educational);
	System.out.println(Books.comic);
	
	

	System.out.println(category.get(1));
	System.out.println(category.replace(1, book1, book2));
	System.out.println(category.replace(2, book2, book1));
	System.out.println(category.remove(3, book3));
    System.out.println(category);	
}

}
