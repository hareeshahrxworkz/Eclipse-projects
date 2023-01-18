package com.xworkz.soldgier.dto;

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
	@Size(min = 3, max = 20, message = "name min  3 and max 20 ")
	private String name;
	private int age;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 30, message = "country min  5 and max 30 ")
	private String country;
	@NotNull
	@NotBlank
	@Size(min = 2, max = 10, message = "rank min  2 and max 10 ")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min = 3, max = 150, message = "datallain min  3 and max 150 ")
	private String datallain;

	private boolean alive;

}
