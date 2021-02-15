package com.kirindongo;

import java.time.LocalDate;

/**
 * Feeding schedule: 1x/wk
 */
public class Reptile extends Animal{

		Reptile(String name, Integer age, LocalDate birthday, LocalDate lastFed) {
				super(name, age, birthday, lastFed);
		}
}
