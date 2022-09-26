package com.imdb.user.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.imdb.user.constant.ListType;

@Converter(autoApply = true)
public class ListTypeConverter implements AttributeConverter<ListType, String> {

	@Override
	public String convertToDatabaseColumn(ListType listType) {
		if (listType == null) {
			return null;
		}
		return listType.getListType();
	}

	@Override
	public ListType convertToEntityAttribute(String listType) {
		if (listType == null) {
			return null;
		}

		return Stream.of(ListType.values()).filter(c -> c.getListType().equals(listType)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}
