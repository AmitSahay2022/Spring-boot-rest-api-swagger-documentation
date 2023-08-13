package com.sahay.Springboottutorial.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Schema(
		description = "Employee model class has long id,string name and address"
	    )
//we use @Schema to provide additional into about our database entity
 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
  private long id;
  private String name;
  private String address;
}
