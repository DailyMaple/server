package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;
import server.dailymaple.constant.QuestTag;

@Getter
@Entity
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quest_id")
    Long Id;

    @Enumerated(EnumType.STRING)
    @Column(name = "quest_tag")
    private QuestTag questTag;

    @Column(name = "quest_name")
    String name;

    @Column(name = "execution_status")
    Boolean executionStatus;
}
