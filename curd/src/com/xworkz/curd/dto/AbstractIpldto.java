package com.xworkz.curd.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class AbstractIpldto implements Serializable {

	private String createdBy;
	private LocalDateTime createDate;
	private String updateBy;
	private LocalDateTime updateDate;

	public AbstractIpldto() {
		System.out.println("running Abstract tpldto");
	}

	@Override
	public String toString() {
		return "AbstractIpldto [createdBy=" + createdBy + ", createDate=" + createDate + ", updateBy=" + updateBy
				+ ", updateDate=" + updateDate + "]";
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

}
