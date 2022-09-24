package com.imdb.movie.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.imdb.movie.constant.Certificate;

@Converter(autoApply = true)
public class CertificateConverter implements AttributeConverter<Certificate, String> {

	@Override
	public String convertToDatabaseColumn(Certificate certificate) {
		if (certificate == null) {
			return null;
		}
		return certificate.getCertificate();
	}

	@Override
	public Certificate convertToEntityAttribute(String certificate) {
		if (certificate == null) {
			return null;
		}

		return Stream.of(Certificate.values()).filter(c -> c.getCertificate().equals(certificate)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}
}
