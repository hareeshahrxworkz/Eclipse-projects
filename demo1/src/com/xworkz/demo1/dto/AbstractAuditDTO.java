package com.xworkz.demo1.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class AbstractAuditDTO  implements Serializable{
	private String createdBy;
	private LocalDate createdDate ;
	private String updatedBy;
	private LocalDate updateDate ;
	

}
