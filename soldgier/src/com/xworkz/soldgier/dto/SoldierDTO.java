package com.xworkz.soldgier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class SoldierDTO extends AbstractAuditDTO {
	@NotNull
	@NotBlank
	@Size(min = 3, max = 20, message = "name must be min  3 and max 20 ")
	private String name;
	@Min(value = 10, message = "age must be grether than 10 less than 150")
	@Max(150)
	private int age;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "country must be min  5 and max 30 ")
	private String country;
	@NotNull
	@NotBlank
	@Size(min = 2, max = 10, message = "rank must be min  2 and max 10 ")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 150, message = "datallain must be min  3 and max 150 ")
	private String batallain;

	private boolean alive;

}
