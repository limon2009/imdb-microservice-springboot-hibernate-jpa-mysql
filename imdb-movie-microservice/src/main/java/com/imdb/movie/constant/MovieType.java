package com.imdb.movie.constant;

public enum MovieType {

	FullMovie("Full Movie"), TVSeries("TV Series"), MiniTVSeries("TV Mini Series");

	private String code;

	private MovieType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
