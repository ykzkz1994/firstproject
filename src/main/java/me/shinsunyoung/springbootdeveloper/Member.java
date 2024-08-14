package me.shinsunyoung.springbootdeveloper;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id; /*DB테이블 id 컬럼과 매칭*/

    @Column(name = "name",nullable = false)
    private String name;/* db테이블의 name컬럼과 매칭*/
}
