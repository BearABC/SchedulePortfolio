package scheduleshare.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.entity.CommunitySchedule;

@Repository
public interface CommunityScheduleRepository extends JpaRepository<CommunitySchedule, Integer> {

}
