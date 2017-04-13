package scheduleshare.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Integer> {

}
