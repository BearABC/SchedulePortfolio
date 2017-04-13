package scheduleshare.domain.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.entity.Community;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Integer> {

}
