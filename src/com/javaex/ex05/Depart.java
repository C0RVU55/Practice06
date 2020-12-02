package com.javaex.ex05;

public class Depart extends Employee {

	 //코드작성
	
	//필드
	private String department;
	
	//생성자
	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department=department;
	}

	//메소드 겟셋
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	//메소드 일반 --> 메소드 오버라이딩 시킴.
	 public void showInformation() {
	        System.out.println("이름:" + super.getName() + "  연봉:" + super.getSalary()+"  부서:"+department);
	    }
	
	

}
