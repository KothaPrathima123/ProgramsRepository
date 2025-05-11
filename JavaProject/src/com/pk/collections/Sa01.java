package com.pk.collections;

public class Sa01 implements Comparable<Sa01>{
	
	private int x;
	private int y;

	public Sa01(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) { //this[arg: Sample object]
										//obj [ele: "a"/"b"/5/null/Ex obj/Sa obj]
		System.out.println("this: "+ this + " obj: "+ obj);
		
		if(obj instanceof Sa01) {
			Sa01 s = (Sa01)obj;
			return this.x == s.x &&
						this.y == s.y;
		}
		return false;
		
	}

	
	@Override
	public String toString() {
		return "Sa(" + x + "," + y + ")";
	}

	@Override
	public int compareTo(Sa01 s) { //this=nao  s=aao
		return this.x - s.x;
	}
}