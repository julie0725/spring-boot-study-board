package com.example.demo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition="TEXT")
    private String content;

    private LocalDateTime createDate;
    @ManyToOne
    private Question question;
//    N:1관계 : 질문 하나당 Answer는 여러개 가능하므로
//    Question객체 가지는 동시에 annotation @ManyToOne 필수 //
//    * 반대로 question에서는 answer를 리스트 형태로 갖고 있음 @OneToMany
}