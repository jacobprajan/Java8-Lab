package com.consumer3.chaining;

public class Movie {
	private String name;
	private String result;

	public Movie(String name, String result) {
		this.name = name;
		this.result = result;
	}

	public String getName() {
		return name;
	}

	public String getResult() {
		return result;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", result=" + result + "]";
	}

}
