package com.momdadhi.bbs.repository.impl

import com.momdadhi.bbs.domain.MemberEntity
import com.momdadhi.bbs.domain.QCodeEntity
import com.momdadhi.bbs.domain.QMemberEntity
import com.momdadhi.bbs.domain.QSubcodeEntity
import com.momdadhi.bbs.repository.BbsRepositoryCustom
import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.beans.factory.annotation.Autowired

class BbsRepositoryImpl : BbsRepositoryCustom {

	@Autowired
	lateinit var queryFactory: JPAQueryFactory

	override fun selectMemberList(): ArrayList<MemberEntity>? {
		var memberEntity: QMemberEntity = QMemberEntity.memberEntity
		var codeEntity: QCodeEntity = QCodeEntity.codeEntity

		return queryFactory.selectFrom(memberEntity)
			.leftJoin(memberEntity.codeEntity, codeEntity).fetch() as ArrayList<MemberEntity>?
	}


}