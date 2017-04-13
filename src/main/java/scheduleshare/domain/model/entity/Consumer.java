package scheduleshare.domain.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "consumer")
public class Consumer implements Serializable {
	@Id
	@Getter
	@Setter
	@Column(name = "consumer_id")
	private String consumerId;

	@Column(name = "consumer_name")
	@Getter
	@Setter
	private String consumerName;

	@Column(name = "password")
	@Getter
	@Setter
	private String password;

	@Getter
	@Setter
	@OneToMany(mappedBy = "consumerId", cascade = CascadeType.ALL)
	private List<Schedule> schedules;

	@Getter
	@Setter
	@OneToMany(mappedBy = "consumerId", cascade = CascadeType.ALL)
	private List<ConsumerCommunity> consumerCommunitys;

	@Override
	public String toString() {
		return "Consumer [consumerId=" + consumerId + ", consumerName=" + consumerName + ", password=" + password + "]";
	}
}
