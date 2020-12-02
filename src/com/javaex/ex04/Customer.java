package com.javaex.ex04;

public class Customer extends User {
	
	//필드
	private int point;
	
	//생성자
	public Customer(String id, String password, String name, int point) {
		super(id,password,name);
		this.point=point;
	}

	//메소드 겟셋
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	//메소드 일반
	public void showInfo() {
		System.out.println("#아이디:"+id+", #패스워드:"+password+", #이름:"+name+", #포인트:"+point);
	}
	public void showInfo2() {
		System.out.println(name+"의 포인트는 "+point+"점입니다.");
	}
	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}
	
	
	

}
