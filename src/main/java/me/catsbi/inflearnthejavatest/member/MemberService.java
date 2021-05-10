package me.catsbi.inflearnthejavatest.member;

import me.catsbi.inflearnthejavatest.domain.Member;
import me.catsbi.inflearnthejavatest.domain.Study;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);

    void validate(Long memberId);

    void notify(Study newstudy);

    void notify(Member member);
}
