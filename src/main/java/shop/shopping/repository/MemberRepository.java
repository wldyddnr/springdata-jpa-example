package shop.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.shopping.domain.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByName(String name);
}
