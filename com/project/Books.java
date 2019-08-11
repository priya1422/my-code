package com.project;
public class Books {
private String bookid;
private String bookname;
private String author;
private String category;
static int magazine=0;
static int educational=0;
static int comic=0;
static int fiction=0;
static int sports=0;

public String getBookid() {
	return bookid;
}

public void setBookid(String bookid) {
	this.bookid = bookid;
}

public String getBookname() {
	return bookname;
}

public void setBookname(String bookname) {
	this.bookname = bookname;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getCategory() {

	return category;
}

@Override
public String toString() {
	return "Books [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", category=" + category + "]";
}

public void setCategory(String category) {
	this.category = category;
	if(category=="Magazines") {
		magazine++;
	}else if(category=="Sports") {
		sports++;
	}else if(category=="Educational") {
		educational++;
	}else if(category=="Fiction") {
		fiction++;
	}else {
		comic++;
	}
 
	
	
}
}





