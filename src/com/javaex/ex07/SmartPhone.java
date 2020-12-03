package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
    	if(str.equals("음악")) {
    		playMusic();
    	}else if(str.equals("앱")) {
    		runApp();
    	}else {
    		super.execute(str);
    		/*
    		call();이 안 먹어서 super.super.call(); 이런 것도 해봤는데 
    		당연히 안 되고 MusicPhone에 있는 super.execute(str)타고 Phone의 call();까지 가는 거였음.
    		*/
    	}
        
    }
 
    //메소드작성
    public void runApp() {
    	System.out.println("앱실행");
    }
    //메소드작성
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    
    
}
