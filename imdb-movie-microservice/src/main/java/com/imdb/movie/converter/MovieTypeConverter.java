package com.imdb.movie.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.imdb.movie.constant.MovieType;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class MovieTypeConverter implements AttributeConverter<MovieType, String> {

	@Override
	public String convertToDatabaseColumn(MovieType movieType) {
		if (movieType == null) {
			return null;
		}
		return movieType.getCode();
	}

	@Override
	public MovieType convertToEntityAttribute(String code) {
		if (code == null) {
			return null;
		}

		return Stream.of(MovieType.values()).filter(c -> c.getCode().equals(code)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}
