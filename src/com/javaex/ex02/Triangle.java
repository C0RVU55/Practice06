package com.javaex.ex02;

public class Triangle extends Shape{
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}
	public Triangle(int width, int height) {
		super("검정","검정"); //파라미터에 부모 필드가 없어도 쓸 수 있고 부모클래스 중 파라미터 2개인 생성자 한번 돌고옴. 그냥 있으면 적용되는듯.
		this.width=width;
		this.height=height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	public Triangle(String fillColor, String lineColor, int Width, int height) {
		super("검정","검정");
		this.width=width;
		this.height=height;
		System.out.println("생성자 Triangle(4) 실행");
	}
}


