package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		//결과 : Shape(2)
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		//결과 : Shape(0) Triangle(0) --> !주의! 부모클래스의 기본생성자가 기본적으로 실행됨.
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		//결과 : !Shape(2)! Triangle(2) --> super("검정","검정") 이거 파라미터에 부모 필드 없어도 쓸 수 있고, 부모클래스 중 파라미터 2개인 생성자 한번 돌고옴. 
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		//결과 : Shape(2) Triangle(4) 
	}

}

