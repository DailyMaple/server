package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.*;
import server.dailymaple.utils.BaseTimeEntity;

@Getter
@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "member")
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;

    String accountId;

    String password;

    boolean deleted;

    public static Member createMember(String accountId, String encodedPassword) {
        Member member = new Member();
        member.accountId = accountId;
        member.password = encodedPassword;
        member.deleted = false;
        return member;
    }
}
