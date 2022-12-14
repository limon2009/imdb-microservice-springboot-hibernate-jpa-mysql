package com.imdb.title.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.imdb.title.constant.Certificate;
import com.imdb.title.constant.TitleType;
import com.imdb.title.converter.CertificateConverter;
import com.imdb.title.converter.TitleTypeConverter;

@Entity
@Table(name = "titles")
public class Title {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "title_genres", joinColumns = { @JoinColumn(name = "title_id") }, inverseJoinColumns = {
			@JoinColumn(name = "genre_id") })
	private Set<Genre> genre = new HashSet<>();

	private String language;

	private String country;

	@Temporal(TemporalType.DATE)
	private Date releaseDate;

	private Short runTime;

	private String color;

	@Convert(converter = CertificateConverter.class)
	private Certificate certificate;

	private String alsoKnownAs;

	@Convert(converter = TitleTypeConverter.class)
	private TitleType titleType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public Set<Genre> getGenre() {
		return genre;
	}

	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Short getRunTime() {
		return runTime;
	}

	public void setRunTime(Short runTime) {
		this.runTime = runTime;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public String getAlsoKnownAs() {
		return alsoKnownAs;
	}

	public void setAlsoKnownAs(String alsoKnownAs) {
		this.alsoKnownAs = alsoKnownAs;
	}

	public TitleType getTitleType() {
		return titleType;
	}

	public void setTitleType(TitleType titleType) {
		this.titleType = titleType;
	}

}
