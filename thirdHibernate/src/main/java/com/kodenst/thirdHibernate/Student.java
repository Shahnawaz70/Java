package com.kodenst.thirdHibernate;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	int marks;
	
	@Column
	String email;
	public Student() {
		super();
	}
	public Student(String name, int marks, String email) {
		super();
		this.name = name;
		this.marks = marks;
		this.email = email;
	}
	public Student(int id, String name, int marks, String email) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && id == other.id && marks == other.marks
				&& Objects.equals(name, other.name);
	}
	
}
