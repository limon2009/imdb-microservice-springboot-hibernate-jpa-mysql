package com.imdb.title.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.imdb.title.constant.TitleType;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class TitleTypeConverter implements AttributeConverter<TitleType, String> {

	@Override
	public String convertToDatabaseColumn(TitleType titleType) {
		if (titleType == null) {
			return null;
		}
		return titleType.getTitleType();
	}

	@Override
	public TitleType convertToEntityAttribute(String titleType) {
		if (titleType == null) {
			return null;
		}

		return Stream.of(TitleType.values()).filter(c -> c.getTitleType().equals(titleType)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}
