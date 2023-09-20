package shop.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.shopping.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
