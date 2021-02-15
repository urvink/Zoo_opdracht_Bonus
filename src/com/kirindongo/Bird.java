package com.kirindongo;

import java.time.LocalDate;

/**
 * Feeding schedule: 1x/2 days
 */
public class Bird extends Animal{

		Bird(String name, Integer age, LocalDate birthday, LocalDate lastFed) {
				super(name, age, birthday, lastFed);
		}
}
