package hello.jdbc.repository;

import static org.assertj.core.api.Assertions.*;

import hello.jdbc.domain.Member;
import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class MemberRepositoryV0Test {

  MemberRepositoryV0 repository = new MemberRepositoryV0();

  @Test
  void crud() throws SQLException {
    Member member = new Member("memberV0_2", 10_000);
    repository.save(member);

    Member findMember = repository.findById(member.getMemberId());
    log.info("findMember={}", findMember);
    assertThat(findMember).isEqualTo(member);
  }
}