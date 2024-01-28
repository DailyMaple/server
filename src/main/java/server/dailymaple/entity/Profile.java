package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;
import server.dailymaple.utils.BaseTimeEntity;


@Getter
@Entity
@Table(name = "profile")
public class Profile extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String profileIdentifier;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
