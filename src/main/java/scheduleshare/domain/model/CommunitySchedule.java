package scheduleshare.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "community_schedule")
public class CommunitySchedule implements Serializable {
	@Id
	@Getter
	@GeneratedValue
	@Setter
	@Column(name = "community_schedule_id")
	private Integer communityScheduleId;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "community_id")
	private Community communityId;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "schedule_id")
	private Schedule scheduleId;

	@Override
	public String toString() {
		return "CommunitySchedule [communityScheduleId=" + communityScheduleId + "]";
	}
}
