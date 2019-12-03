package com.resolve.model;



public class Counter {
	private String countNumber;

	public Counter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Counter(String countNumber) {
		super();
		this.countNumber = countNumber;
	}

	public String getCountNumber() {
		return countNumber;
	}

	public void setCountNumber(String countNumber) {
		this.countNumber = countNumber;
	}

	@Override
	public String toString() {
		return "Counter [countNumber=" + countNumber + "]";
	}

	
	
	
}
