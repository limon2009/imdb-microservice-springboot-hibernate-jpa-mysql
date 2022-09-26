package com.imdb.user.constant;

public enum ListType {
	
	TITLES("Titles"), PEOPLE("People"), IMAGES("Images");

	private String listType;

	private ListType(String listType) {
		this.listType = listType;
	}

	public String getListType() {
		return listType;
	}
}
