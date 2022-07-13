package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class CourseEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
int cid;
	@Column
String cname;
	@Column
String fname;
	@Column
String ctype;
public CourseEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public CourseEntity(int cid, String cname, String fname, String ctype) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.fname = fname;
	this.ctype = ctype;
}
public CourseEntity(String cname, String fname, String ctype) {
	super();
	this.cname = cname;
	this.fname = fname;
	this.ctype = ctype;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getCtype() {
	return ctype;
}
public void setCtype(String ctype) {
	this.ctype = ctype;
}

}
