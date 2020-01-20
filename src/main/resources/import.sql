-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)



INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('348972198' , 'John', 'Smith', '2101234567', 'john.smith@gmail.com', 'john_smith', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');


INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('348972199' , 'John', 'Smith', '2101234567', 'john.smith@gmail.com', 'admin', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Admin');





INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('35168', 'War and Peace','1920-01-01', 'LITERARY_REALISM');


INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-19', 'In progress','351680', '348972198');
