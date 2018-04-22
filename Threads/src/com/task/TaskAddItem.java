package com.task;

import java.util.List;

public class TaskAddItem implements Runnable {

	private List<String> list;
	private int threadNumber;

	public TaskAddItem(List<String> list, int threadNumber) {
		this.list = list;
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			list.add("Thread " + threadNumber + " - " + i);
		}

	}

}
