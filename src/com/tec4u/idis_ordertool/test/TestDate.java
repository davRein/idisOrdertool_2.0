package com.tec4u.idis_ordertool.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("date: " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString());
	}

}
