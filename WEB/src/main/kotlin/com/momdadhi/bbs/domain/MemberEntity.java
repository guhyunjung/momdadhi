package com.momdadhi.bbs.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "member", schema = "mdh", catalog = "")
public class MemberEntity {
	@Id
	@Column(name = "ID")
	private String id;

	@Basic
	@Column(name = "AGE")
	private Integer age;

	@Basic
	@Column(name = "CREATEDATE")
	private Timestamp createdate;

	@Basic
	@Column(name = "DESCRIPTION")
	private String description;

	@Basic
	@Column(name = "LASTMODIFIEDDATE")
	private Timestamp lastmodifieddate;

	@Basic
	@Column(name = "ROLETYPE")
	private String roletype;

	@Basic
	@Column(name = "NAME")
	private String name;

	@ManyToOne
	@JoinColumn(name = "CODE")
	private CodeEntity codeEntity;

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name = "CODE", referencedColumnName = "CODEGROUP", insertable = false, updatable = false),
			@JoinColumn(name = "SUBCODE", referencedColumnName = "SUBCODE", insertable = false, updatable = false)
	})
	private SubcodeEntity subcodeEntity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Timestamp getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getLastmodifieddate() {
		return lastmodifieddate;
	}

	public void setLastmodifieddate(Timestamp lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}

	public String getRoletype() {
		return roletype;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CodeEntity getCodeEntity() {
		return codeEntity;
	}

	public void setCodeEntity(CodeEntity codeEntity) {
		this.codeEntity = codeEntity;
	}

	public SubcodeEntity getSubcodeEntity() {
		return subcodeEntity;
	}

	public void setSubcodeEntity(SubcodeEntity subcodeEntity) {
		this.subcodeEntity = subcodeEntity;
	}
}
