-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)


--password for the first(example) user and the admin is: 123

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('201230586' , 'John', 'Smith', '2101234567', 'john.smith@gmail.com', 'john_smith', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('756289634' , 'Tom', 'Chelsie', '2101234567', 'john.smith@gmail.com', 'admin', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Admin');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('785210564' , 'George', 'Kopis', '2101234567', 'john.smith@gmail.com', 'george_kopis', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('952102461' , 'Dean', 'Soras', '2101234567', 'john.smith@gmail.com', 'dean_soras', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('250036544' , 'Nick', 'Wellow', '2101234567', 'john.smith@gmail.com', 'nick_wellow', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('982354761' , 'Peter', 'Simons', '2101234567', 'john.smith@gmail.com', 'peter_simons', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('134965820' , 'Cate', 'Dublington', '2101234567', 'john.smith@gmail.com', 'cate_dublington', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('758214602' , 'Maria', 'Pipers', '2101234567', 'john.smith@gmail.com', 'maria_pipers', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('362056902' , 'Simon', 'Maters', '2101234567', 'john.smith@gmail.com', 'simon_maters', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('953245612' , 'Georgia', 'Tinkers', '2101234567', 'john.smith@gmail.com', 'georgia_tinkers', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('520258964' , 'Chris', 'Senters', '2101234567', 'john.smith@gmail.com', 'chris_senters', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('302301456' , 'Samantha', 'Kollins', '2101234567', 'john.smith@gmail.com', 'samantha_kollins', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('985862143' , 'Bruce', 'Waters', '2101234567', 'john.smith@gmail.com', 'bruce_waters', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('751243602' , 'Zoe', 'Binkers', '2101234567', 'john.smith@gmail.com', 'zoe_binkers', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');






INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('35168', 'War and Peace','1867-06-25', 'Literary realism');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('35168', 'The Grapes of Wrath','1939-04-14', 'Drama');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('68023', 'The Murderess', '1903-11-01', 'Drama');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('75682', 'Captain Michalis', '1950-05-01', 'Drama');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('02315', 'Crime and Punishment','1866-12-31', 'Literary realism');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('36040', 'Report to Greco', '1961-08-01', 'Drama');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('98025', 'The Last Temptation', '1951-03-01', 'Drama');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('32865', 'Of Mice and Men','1937-01-08', 'Literary realism');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('45812', 'Looking for Alaska','2005-03-03', 'Literary realism');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('39185', 'Madame Bovary','1856-05-03', 'Literary realism');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('55680', 'Anna Karenina','1877-10-16', 'Literary realism');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('62571', 'Christ Recrucified', '1962-01-01', 'Drama');

INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('35246', 'Princess Isambo', '1945-02-01', 'Drama');






INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'Completed','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'Completed','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');

INSERT INTO BORROW (borrow_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', 'In progress','351680', '201230586');
