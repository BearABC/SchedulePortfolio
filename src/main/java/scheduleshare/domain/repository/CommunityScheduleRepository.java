package scheduleshare.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.CommunitySchedule;

@Repository
public interface CommunityScheduleRepository extends JpaRepository<CommunitySchedule, Integer> {

}
