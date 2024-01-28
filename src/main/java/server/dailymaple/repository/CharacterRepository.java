package server.dailymaple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.dailymaple.entity.Character;
import server.dailymaple.entity.Member;

public interface CharacterRepository extends JpaRepository<Character,Long> {
}