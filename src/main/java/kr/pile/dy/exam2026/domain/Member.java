package kr.pile.dy.exam2026.domain;

import lombok.Data;

@Data
public class Member {
    private String id;
    private String passwd;
    private String city;
    private String gender;
    private String[] hobby;
    private String greetings;

}

