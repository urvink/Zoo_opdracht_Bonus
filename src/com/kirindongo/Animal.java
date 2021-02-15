package com.kirindongo;

import java.time.LocalDate;

public class Animal {
		private String _name;
		private Integer _age;
		private LocalDate _birthday;
		private LocalDate _lastFed;

		Animal(String name, Integer age, LocalDate birthday, LocalDate lastFed){
				this._name = name;
				this._age = age;
				this._birthday = birthday;
				this._lastFed = lastFed;
		}
}
