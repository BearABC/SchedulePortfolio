CREATE TABLE community(community_id INT AUTO_INCREMENT PRIMARY KEY, community_name VARCHAR, host_id INT);

CREATE TABLE community_schedule(
	community_schedule_id INT AUTO_INCREMENT PRIMARY KEY,
	community_id INT,
	schedule_id INT
	);

CREATE TABLE consumer(
	consumer_id INT AUTO_INCREMENT PRIMARY KEY,
	consumer_name VARCHAR,
	password VARCHAR
	);

CREATE TABLE consumer_community(
	consumer_community_id INT AUTO_INCREMENT PRIMARY KEY,
	consumer_id INT,
	community_id INT
	);

CREATE TABLE schedule(
	schedule_id INT AUTO_INCREMENT PRIMARY KEY,
	schedule_title VARCHAR,
	schedule_memo VARCHAR(255),
	schedule_date DATE,
	start_time TIME,
	end_time TIME,
	consumer_id INT,
	);