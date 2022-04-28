INSERT INTO `users` (`id`, `first_name`, `last_name`, `age`, `date_of_birth`, `insurance_provider`, `insurance_number`, `allergies`, `medications`, `immunizations`, `address`, `lung_charts`, `heart_charts`, `medical_history`, `current_issues`, `phone_number`) 
VALUES ('1', 'Rony', 'willian', '33', '1991-05-13', 'Susan ',
'878', 'yes', 'none', 'none', '175 road ny', 'none', 'none', 'flu', 'flu', '+1455-55-6655'),
('2', 'John', 'willian', '34', '1990-05-13', 'Susan ',
'878', 'yes', 'none', 'none', '175 road ny', 'none', 'none', 'flu', 'flu', '+1455-55-3456');


INSERT INTO `doctors`
(`id`,
  `first_name`,
  `last_name`,
  `address`,
  `phone_number`)
VALUES
('1', 'Stephen','Rock','453 HIGHWAY RD NY','+1455-55-4453'),
('2', 'David','Betro','544 albano RD NY','+1455-55-3457');

INSERT INTO `appointments`
(`doctor_id`,
  `user_id`,
  `appointment_date`)
VALUES
('1', '2','2022-02-13')
,('2', '1','2022-02-13');


