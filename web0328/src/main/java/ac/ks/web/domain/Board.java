package ac.ks.web.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

//Lombok
@Getter
@NoArgsConstructor
//JPA
@Entity
@Table
public class Board implements Serializable {
    // 지금 implements로 인터페이스를 들고왔지만 오버라이딩을 하지않고 있음
    // 이것을 마크 인터페이스라고 함


    // 클래스, 인터페이스 => 대문자 시작
    // 메서드, 프로퍼티 => 소문자 시작
    // static final => 전체 대문자 <-- 예외

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idx;

    @Column
    private String title;

    @Column
    private String subTitle;

    @Column
    private String contet;

    @Column
    @Enumerated(EnumType.STRING)
    private BoardType boardType;

    @Column
    private LocalDate createdDate;

    @Column
    private LocalDate updatedDate;
    // LocalDate는 OS에 설정된 장소의 시간을 따라감
    // UTC 개발자의 마음속에 꼭 담아두는 시간 (전세계 개발자들 마음속, 협정시)

    @Builder
    public Board(String title, String subTitle, String contet, BoardType boardType, LocalDate createdDate, LocalDate updatedDate) {
        this.title = title;
        this.subTitle = subTitle;
        this.contet = contet;
        this.boardType = boardType;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
