package scheduleshare.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.Community;

@Repository
public interface CommunityRepository extends JpaRepository<Community, Integer> {

}
