package com.besant.threadPool;

public class Thread1 implements Runnable {
	
	private int propInt;
	private String propString;

	public int getPropInt() {
		return propInt;
	}

	public void setPropInt(int propInt) {
		this.propInt = propInt;
	}

	public String getPropString() {
		return propString;
	}

	public void setPropString(String propString) {
		this.propString = propString;
	}

	@Override
	public void run() {
		System.out.println("String value is: "+getPropString());
		System.out.println("Integer value is: "+getPropInt());

	}

}
