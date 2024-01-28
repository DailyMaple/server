package server.dailymaple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import server.dailymaple.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}