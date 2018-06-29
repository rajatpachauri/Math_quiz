package com.rajat.quetsions;

public class Questions {
//	ArrayList<Question_and_answer> questions = new ArrayList<>();
	char [] operation = {'+','*','/','-','%'};
	int [] arr = new int [4];
	int a = (int)(Math.random()*100+1);
	int b = (int)(Math.random()*100+1);
	int c = (int)(Math.random()*100+1);
	static int right = 0;
	static int nquestions = 0;
	char first = operation[(int)(Math.random()*5)]; 
	char second = operation[(int)(Math.random()*5)];
	String question = "What is "+a+first+b+second+c+" ?";
	int result = a+operation[(int)(Math.random()*5)]+b+operation[(int)(Math.random()*5)]+c;
	public Questions() {
	}
	public String getQuestion() {
		return question;
	}
	public int getResult() {
		return result;
	}
	public static int getRight() {
		return right;
	}
	public static int getNquestions() {
		return nquestions;
	}
	public void checkResult(int answer) {
		if(answer == result) {
			right++;
		}
		nquestions++;
	}
	public int[] getopt() {
		for( int i = 0;i< 4;i++) {
			arr[i] = (int)(Math.random()*1000+1);
		}
		arr[(int)Math.random()*4] = result;
		return arr;
	}
}
