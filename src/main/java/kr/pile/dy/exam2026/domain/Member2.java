package kr.pile.dy.exam2026.domain;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member2 {
    @MemberId
    private String memberId;

    @Size(min=4, max=10, message = "비밀번호 4~10자")
    private String passwd;
}
