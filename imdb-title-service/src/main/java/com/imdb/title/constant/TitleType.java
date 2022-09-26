package com.imdb.title.constant;

public enum TitleType {

	FULL_MOVIE("Full Movie"), TV_SERIES("TV Series"), MINI_TV_SERIES("TV Mini Series");

	private String titleType;

	private TitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getTitleType() {
		return titleType;
	}
}
