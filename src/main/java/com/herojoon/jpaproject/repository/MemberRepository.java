package com.herojoon.jpaproject.repository;

import com.herojoon.jpaproject.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {  // JpaRepository를 상속하여 사용. <객체, ID>
}
