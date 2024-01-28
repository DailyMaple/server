package server.dailymaple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.dailymaple.entity.Quest;

public interface QuestRepository extends JpaRepository<Quest,Long> {
}
