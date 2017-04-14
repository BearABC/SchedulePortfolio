package scheduleshare.domain.model.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import scheduleshare.domain.model.entity.Community;
import scheduleshare.domain.model.entity.CommunitySchedule;
import scheduleshare.domain.model.entity.Schedule;
import scheduleshare.domain.model.repository.CommunityRepository;
import scheduleshare.domain.model.repository.CommunityScheduleRepository;
import scheduleshare.domain.model.repository.ConsumerCommunityRepository;
import scheduleshare.domain.model.repository.ConsumerRepository;
import scheduleshare.domain.model.repository.ScheduleRepository;

@Service
public class CommunityService {

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
	 * @param commuId : スケジュールが表示されるコミュニティのID
	 *
	 * コミュニティに表示されるスケジュールを全て取得するメソッド
	 */
	@Transactional
	public List<Schedule> getGroupSchedule(Integer commuId) {
		List<Schedule> schedules = new ArrayList<Schedule>();

		Community community = entityManager.find(Community.class, commuId);

		List<CommunitySchedule> communitySchedules = community.getCommunitySchedules();

		for (CommunitySchedule c : communitySchedules) {
			schedules.add(c.getScheduleId());
		}

		return schedules;
	}
}
