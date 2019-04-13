package ac.kr.web.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

// Lombok
@Getter
@NoArgsConstructor
// JPA
@Entity
@Table
public class Board implements Serializable {

    @Column
    String NAMe;
    @Column
    String LABEL;
    @Column
    String EMAIL;
    @Column
    String PHONE;

}
