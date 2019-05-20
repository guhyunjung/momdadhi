package com.momdadhi.bbs.domain

import javax.persistence.*
import java.io.Serializable

@Entity
@Table(name = "subcode", schema = "mdh", catalog = "")
class SubcodeEntity : Serializable {

	@Id
	@Column(name = "ID")
	var id: Int = 0

	@Basic
	@Column(name = "SUBCODE")
	var subcode: Int? = null

	@Basic
	@Column(name = "SUBCODENAME")
	var subcodename: String? = null

	@ManyToOne
	@JoinColumn(name = "CODEGROUP")
	var codeEntity: CodeEntity? = null
}
