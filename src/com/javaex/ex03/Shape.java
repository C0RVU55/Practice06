package com.javaex.ex03;

public class Shape {
	
	//필드
	/* 자식클래스에서 필드 변수를 갖다 쓸 수 있도록 접근제한자를 변경함.
	private String fillColor;
	private String lineColor;
	*/
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	//부모클래스의 기본생성자를 추가해줌.
	public Shape() {}
	public Shape(String fillColor, String lineColor) {
		this.fillColor=fillColor;
		this.lineColor=lineColor;
	}
	
	//메소드 겟셋
	public void setFillColor(String fillColor) {
		this.fillColor=fillColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor=lineColor;
	}
	
}

