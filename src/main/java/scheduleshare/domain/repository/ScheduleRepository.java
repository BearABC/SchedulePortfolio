package scheduleshare.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

}
