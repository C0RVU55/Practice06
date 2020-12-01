package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNO;
	private int point;
	
	//생성자
	public Customer() {}
	public Customer(String name, String hp, int cNO, int point) {
		super(name,hp);
		this.cNO = cNO;
		this.point = point;
	}
	
	//매소드 겟셋
	public int getcNO() {
		return cNO;
	}
	public void setcNO(int cNO) {
		this.cNO = cNO;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Customer [cNO=" + cNO + ", point=" + point + "]";
	}
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp+", #고객번호:"+cNO+", #포인트점수:"+point);
	}
	
	
	
	
	

	
}
