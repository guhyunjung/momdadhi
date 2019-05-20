package com.momdadhi.bbs.domain

import javax.persistence.*
import java.util.ArrayList

@Entity
@Table(name = "code", schema = "mdh", catalog = "")
class CodeEntity {
	@Basic
	@Column(name = "ID")
	var id: Int = 0

	@Id
	@Basic
	@JoinColumn(name = "CODEGROUP")
	var codegroup: Int? = null

	@Basic
	@Column(name = "CODEGROUPNAME")
	var codegroupname: String? = null

	@OneToMany(mappedBy = "codeEntity")
	var subcodeEntity = mutableListOf<SubcodeEntity>()
}
