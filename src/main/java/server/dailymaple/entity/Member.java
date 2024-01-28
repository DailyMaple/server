package server.dailymaple.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    Long id;

    String accountId;

    String password;

}
