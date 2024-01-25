package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "character_id")
    Long id;

    @Column(name = "character_ocid")
    String characterId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
