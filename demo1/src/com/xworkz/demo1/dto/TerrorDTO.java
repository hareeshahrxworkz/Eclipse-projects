package com.xworkz.demo1.dto;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class TerrorDTO extends AbstractAuditDTO {

	@NotNull
	private String name;
	private int age;
	private String country;
	private String state;

}
