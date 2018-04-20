package dev.sgp.error;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ErrorAjouter {

	public ErrorAjouter() {
	}

	public boolean valid(String dateNaissance) {
		try {
			LocalDate dateNaissanceParse = LocalDate.parse(dateNaissance, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}catch(Exception DateTimeParseException){
			return false;
		}
		return true;
	}

}
