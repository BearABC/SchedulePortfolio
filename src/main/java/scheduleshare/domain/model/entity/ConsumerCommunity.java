package scheduleshare.domain.model.entity;

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
@Table(name = "consumer_community")
public class ConsumerCommunity implements Serializable {
	@Id
	@GeneratedValue
	@Getter
	@Column(name = "consumer_community_id")
	private Integer consumerCommunityId;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "consumer_id")
	private Consumer consumerId;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "community_id")
	private Community communityId;

	@Override
	public String toString() {
		return "ConsumerCommunity [consumerCommunityId=" + consumerCommunityId + "]";
	}
}