package com.akash.producerconsumer;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> questionList = null;

	public Consumer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void answerQuestion() throws InterruptedException {
		synchronized(questionList) {
		while(questionList.isEmpty()) {
			System.out.println("No questions to answer... waiting for producer.");
			questionList.wait();
		}
		}
		
		synchronized(questionList) {
			System.out.println("Answered Question: " + questionList.remove(0));
			questionList.notify();
		}
	}
		
	@Override
	public void run() {		
		while(true) {
		try {
			answerQuestion();
		} catch (InterruptedException e) {
		}	
		}
	}

}
