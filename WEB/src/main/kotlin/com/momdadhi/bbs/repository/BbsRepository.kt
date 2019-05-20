package com.momdadhi.bbs.repository

import com.momdadhi.bbs.domain.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BbsRepository : JpaRepository<MemberEntity, Int>, BbsRepositoryCustom {}

interface BbsRepositoryCustom {
	fun selectMemberList() : ArrayList<MemberEntity>?
}
