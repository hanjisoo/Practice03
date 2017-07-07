package com.javaex.problem05;

public class StringUtilApp {

    public static void main(String[] args) {

        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
        String resultStr = StringUtil.concatString(strArray);//호출.클래스 스프링-하면 일하고 결과 퉤!
        
        System.out.println("결과 문자열:" + resultStr);
    }

}
