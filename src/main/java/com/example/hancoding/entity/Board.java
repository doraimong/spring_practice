package com.example.hancoding.entity;

import lombok.Data;

import javax.persistence.*;

// table을 의미, 자바의 영속성 jpa에서 이 클래스가 디비 테이블의미한다고 함
@Entity
@Data//lombok 세팅
public class Board {//jpa가 읽어준다

    @Id // primary key를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //identity : mysql, mariadb에서 사용하는거
    private Integer id;

    private String title;

    private String content;
}
