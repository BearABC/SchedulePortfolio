INSERT INTO community(community_name, host_id)
VALUES('通府高校3-1', 1);

INSERT INTO community_schedule(community_id, schedule_id)
VALUES (1, 1), (1, 2);

INSERT INTO consumer(consumer_name, password)
VALUES ('山田太郎', 'taro0101'), ('田中花子', 'flowEr_E2oE');

INSERT INTO consumer_community(consumer_id, community_id)
VALUES (1, 1), (2, 1);

INSERT INTO schedule(schedule_title, schedule_memo, schedule_date, start_time, end_time, consumer_id)
VALUES ('花見', 'お弁当持参', '2017-04-03', '11:30:00', '15:00:00', 1),
		('入学式', 'スーツ着用', '2017-04-01', '07:00:00', '11:30:00', 1),
		('卒業式', '特攻服着用', '2017-04-30', '10:00:00', '10:15:00', 1);