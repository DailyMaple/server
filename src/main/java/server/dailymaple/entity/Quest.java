package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;
import server.dailymaple.constant.QuestTag;

@Getter
@Entity
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long Id;

    @Enumerated(EnumType.STRING)
    @Column
    private QuestTag questTag;

    @Column
    String name;

    @Column
    Boolean executionStatus;

    @ManyToOne
    @JoinColumn(name = "character_id")
    private Character character;
}
