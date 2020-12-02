package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	
	//필드
	/* 출력하는 메소드밖에 없어서 필드 따로 필요없음.
	private String state;
    
	//생성자 --> 기본생성자만 필요해서 안 써도 됨.
	
	//메소드 겟셋
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	//메소드 일반 --> 부모클래스의 메소드를 다 덮어씀.
	@Override
	public String toString() {
		return "MyBase [state=" + state + "]";
	}
	*/
	public void service(String state){
		if (state.equals("낮")) { //문자열의 같다(==) 는 equals()를 사용합니다.
            day(); 
        } else if (state.equals("밤")) {
            night();
        }else {
        	afternoon();
        }
	}
	public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
    	System.out.println("밤에는 숙면");
    }
    public void afternoon() {
    	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
	
	
}
