package com.imdb.movie.constant;

public enum Certificate {

	NOT_RATED("Not Rated"), PG_13("PG-13"), R("R"), TV_MA("TV-MA"), TV_14("TV-14");

	private String certificate;

	private Certificate(String certificate) {
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}
}
