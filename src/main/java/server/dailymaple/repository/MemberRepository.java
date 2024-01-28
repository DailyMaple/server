package server.dailymaple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.dailymaple.entity.Member;

public interface MemberRepository extends JpaRepository<Member,Long> {
    boolean existsByAccountId(String accountId);
}
