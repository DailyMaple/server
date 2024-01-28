package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;


@Getter
@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;

    @Column
    String characterIdentifier;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
