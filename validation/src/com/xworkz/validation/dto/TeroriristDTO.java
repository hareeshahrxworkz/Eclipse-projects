package com.xworkz.validation.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class TeroriristDTO extends AbstractAuditDTO {
	@NonNull
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 20)
	private String name;
	@NonNull
	@NotNull
	@Min(1)
	@Max(150)
	private int age;
	@NonNull
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 20)
	private String Country;
	private boolean prison;
	private boolean alive;
	private LocalDate Year;

}
