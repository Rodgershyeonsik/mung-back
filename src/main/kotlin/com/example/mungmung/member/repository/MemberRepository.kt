package com.example.mungmung.member.repository

import com.example.mungmung.member.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member,Long> {

}