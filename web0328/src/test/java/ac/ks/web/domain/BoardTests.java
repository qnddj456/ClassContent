package ac.ks.web.domain;

import ac.ks.web.repository.BoardRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
public class BoardTests {

    // 테스트의 목적
    // 데이터베이스에 데이터가 저장이 되고 값을 불러올 수 있는지

    @Autowired
    private BoardRepository boardRepository;


    @Before
    public void testSave(){

        // Builder Pattern 생성자처럼 순서를 외울 필요가 없음.
        Board board = Board.builder()
                .contet("Hello")
                .build();
        boardRepository.save(board);
    }

    @Test
    public void findBoardAll(){
        Board findBoard = boardRepository.findById(1L).orElse(null);
        System.out.println(findBoard.getContet());
    }

}
