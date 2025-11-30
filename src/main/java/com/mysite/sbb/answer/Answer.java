package com.mysite.sbb.answer;


import com.mysite.sbb.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = IDENTITY) //이건 어떤 어노테이션이냐면 자동으로 id값을 1씩 증가시키는 어노테이션이다. strategy는 어떤 방식으로 증가시킬건지에 대한 설정이다. IDENTITY는 기본키 생성을 데이터베이스에 위임하는 방식을 의미한다.
    private int id;

    private LocalDateTime CreateDate;

    @ManyToOne
    private Question question;

    @Column(columnDefinition = "TEXT")
    private String content;

}


