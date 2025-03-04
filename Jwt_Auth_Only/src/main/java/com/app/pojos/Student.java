package com.app.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@ToString

public class Student {
	
	
	private Integer id;
	
	private String name;
	
	private String city;
	
	private Integer marks;

}
