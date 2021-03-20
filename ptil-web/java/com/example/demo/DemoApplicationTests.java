package com.example.demo;

import java.util.Stack;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	//@Test
	void contextLoads() {
		
	}

	
	@Test
	boolean verifyString() {
		String s = "()";
		Stack<Character> stack=new Stack<>();
        //假如长度是1或者不为偶数
       if(s.length()<2||s.length()%2!=0){
           if(s.isEmpty()){
               return true;
           }
           else{
               return false;
           }
        }
       for(char c:s.toCharArray()){
           if(c=='(')
               stack.push(')');
           else if(c=='{'){
               stack.push('}');
           }
           else if(c=='['){
               stack.push(']');
           }else if(stack.isEmpty()||stack.pop()!=c){
               return false;
           }
       }
       return stack.isEmpty();
	}
}
