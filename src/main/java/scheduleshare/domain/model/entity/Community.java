package scheduleshare.domain.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "community")
public class Community implements Serializable {
	@Id
	@Getter
	@GeneratedValue
	@Column(name = "community_id")
	private Integer communityId;

	@Column(name = "community_name")
	@Getter
	@Setter
	private String communityName;



	@Getter
	@Setter
	@OneToOne
	@JoinColumn(name = "host_id")
	private Consumer hostId;

	@Getter
	@Setter
	@OneToMany(mappedBy = "communityId")
	private List<CommunitySchedule> communitySchedules;

	@Getter
	@Setter
	@OneToMany(mappedBy = "communityId", cascade = CascadeType.ALL)
	private List<ConsumerCommunity> consumerCommunitys;

	@Override
	public String toString() {
		return "Community [communityId=" + communityId + ", communityName=" + communityName + ", hostId=" + hostId
				+ "]";
	}
}
