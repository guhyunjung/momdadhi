package com.momdadhi.bbs.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "subcode", schema = "mdh", catalog = "")
public class SubcodeEntity implements Serializable {

	@Id
	@Column(name = "ID")
	private int id;

	@Basic
	@Column(name = "SUBCODE")
	private Integer subcode;

	@Basic
	@Column(name = "SUBCODENAME")
	private String subcodename;

	@ManyToOne
	@JoinColumn(name = "CODEGROUP")
	private CodeEntity codeEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getSubcode() {
		return subcode;
	}

	public void setSubcode(Integer subcode) {
		this.subcode = subcode;
	}

	public String getSubcodename() {
		return subcodename;
	}

	public void setSubcodename(String subcodename) {
		this.subcodename = subcodename;
	}

	public CodeEntity getCodeEntity() {
		return codeEntity;
	}

	public void setCodeEntity(CodeEntity codeEntity) {
		this.codeEntity = codeEntity;
	}
}
