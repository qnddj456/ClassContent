package ac.ks.web.repository;

import ac.ks.web.domain.Board;
import org.springframework.data.jpa.repository.JpaRepository;

// Board의 데이터를 데이터베이스로 보내는 인터페이스
// Repository가 그런 역할을 함
public interface BoardRepository extends JpaRepository<Board, Long> {
}
