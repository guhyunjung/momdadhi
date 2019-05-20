package com.momdadhi.bbs.repository.impl

import com.momdadhi.bbs.domain.CodeEntity
import com.momdadhi.bbs.domain.QCodeEntity
import com.momdadhi.bbs.domain.QMemberEntity
import com.momdadhi.bbs.domain.SubcodeEntity
import com.querydsl.jpa.impl.JPAQueryFactory
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BbsRepositoryImplTest {

	@Autowired(required = true)
	lateinit var queryFactory: JPAQueryFactory

	@Autowired(required = true)
	lateinit var em: EntityManager

	@Test
	fun selectMemberList() {
		var memberEntity: QMemberEntity = QMemberEntity.memberEntity
		var codeEntity: QCodeEntity = QCodeEntity.codeEntity

		var members = queryFactory.selectFrom(memberEntity).fetch()
			//.leftJoin(memberEntity.codeEntity, codeEntity).fetch()
		for (member in members) {
			member.let {
				println("${it.id}, ${it.age}, ${it.name}, ${it.codeEntity.codegroup}, ${it.codeEntity.codegroupname}, ${it.subcodeEntity.subcode}, ${it.subcodeEntity.subcodename}")
			}
		}
	}

	@Transactional(noRollbackFor = [Exception::class])
	@Test
	fun saveNonOwenerTest() {

		var subCode1 = SubcodeEntity()
		subCode1.id = 16
		subCode1.subcode = 31
		subCode1.subcodename = "광명여중1학년1반"
		em.persist(subCode1)

		var subCode2 = SubcodeEntity()
		subCode2.id = 17
		subCode2.subcode = 32
		subCode2.subcodename = "광명여중2학년1반"
		em.persist(subCode2)

		var code = CodeEntity()
		code.id = 4
		code.codegroup = 400
		code.codegroupname = "광명여중"

		code.subcodeEntity?.add(subCode1)
		code.subcodeEntity?.add(subCode2)

		em.persist(code)


	}
}