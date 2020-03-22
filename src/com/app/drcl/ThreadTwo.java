package com.app.drcl;

public class ThreadTwo extends Thread {
	public void run() {
		for(int j=1;j<=10;j++) {
			System.out.println("Thread two executed "+j);
		}
		System.out.println("Thread two ended");
	}

}
