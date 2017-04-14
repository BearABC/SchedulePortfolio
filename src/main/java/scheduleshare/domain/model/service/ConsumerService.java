package scheduleshare.domain.model.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scheduleshare.domain.model.entity.Consumer;
import scheduleshare.domain.model.repository.CommunityRepository;
import scheduleshare.domain.model.repository.CommunityScheduleRepository;
import scheduleshare.domain.model.repository.ConsumerCommunityRepository;
import scheduleshare.domain.model.repository.ConsumerRepository;
import scheduleshare.domain.model.repository.ScheduleRepository;

@Service
public class ConsumerService {
	@PersistenceContext
	EntityManager entityManager;

	@Autowired
	CommunityRepository communityRepository;
	@Autowired
	CommunityScheduleRepository communityScheduleRepository;
	@Autowired
	ConsumerCommunityRepository consumercommunityRespository;
	@Autowired
	ConsumerRepository consumerRepository;
	@Autowired
	ScheduleRepository scheduleRepository;

	/***
	 * ユーザーIDを受け取ってConsumer型インスタンスを返すメソッド
	 *
	 * @param consumerId
	 * 検索したいユーザーのID
	 *
	 * @return
	 * ユーザーIDが一致するユーザーデータかnullを返す
	 */
	@Transactional
	public Consumer ConsumerSearch(String consumerId) {
		return entityManager.find(Consumer.class, consumerId);
	}
}
