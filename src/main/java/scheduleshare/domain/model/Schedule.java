package scheduleshare.domain.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "schedule")
public class Schedule implements Serializable {
	@Id
	@Getter
	@GeneratedValue
	@Column(name = "schedule_id")
	private Integer scheduleId;

	@Column(name = "schedule_title")
	@Getter
	@Setter
	private String scheduleTitle;

	@Column(name = "schedule_memo")
	@Getter
	@Setter
	private String scheduleMemo;

	@Column(name = "schedule_date")
	@Getter
	@Setter
	private Date scheduleDate;

	@Column(name = "start_time")
	@Getter
	@Setter
	private Time startTime;

	@Column(name = "end_time")
	@Getter
	@Setter
	private Time endTime;

	@Getter
	@Setter
	@ManyToOne
	@JoinColumn(name = "consumer_id")
	private Consumer consumerId;

	@Getter
	@Setter
	@OneToMany(mappedBy = "scheduleId", cascade = CascadeType.ALL)
	private List<CommunitySchedule> communitySchedules;

	@Override
	public String toString() {
		return "予定名:" + scheduleTitle + "\t予定詳細:"
				+ scheduleMemo + "\t予定日" + scheduleDate + "\t開始時刻:" + startTime + "\t終了時刻" + endTime
				+ "]";
	}

}
