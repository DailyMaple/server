package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;
import server.dailymaple.constant.QuestTag;

@Getter
@Entity
@Table(name = "quest")
public class Quest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long Id;

    @Enumerated(EnumType.STRING)
    @Column
    private QuestTag questTag;

    @Column
    private String name;

    @Column
    private Boolean executionStatus;

    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;
}
