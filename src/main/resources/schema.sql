
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `date_of_birth` date DEFAULT NULL,
  `insurance_provider` varchar(45) DEFAULT NULL,
  `insurance_number` int DEFAULT NULL,
  `allergies` varchar(45) DEFAULT NULL,
  `medications` varchar(45) DEFAULT NULL,
  `immunizations` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `lung_charts` varchar(45) DEFAULT NULL,
  `heart_charts` varchar(45) DEFAULT NULL,
  `medical_history` varchar(45) DEFAULT NULL,
  `current_issues` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `doctors`;
CREATE TABLE `doctors` (
  `id` int NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `appointments`;
CREATE TABLE `appointments` (
  `doctor_id` int NOT NULL,
  `user_id` int NOT NULL,
  `appointment_date` date DEFAULT NULL,
  PRIMARY KEY (`doctor_id`,`user_id`),
  CONSTRAINT `appointments_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `appointments_ibfk_2` FOREIGN KEY (`doctor_id`) REFERENCES `doctors` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);
