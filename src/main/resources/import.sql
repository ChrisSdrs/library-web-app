-- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-sql.html
-- https://docs.spring.io/spring-boot/docs/current/reference/html/howto-database-initialization.html
-- IN THIS FILE WE CAN WRITE AN SQL SCRIPT CONTAINING:
-- SCHEMA, TABLE AND DATA MANIPULATION QUERIES
-- TO BE EXECUTED AUTOMATICALLY DURING THE INITIALIZATION OF THE APPLICATION
-- AND AFTER THE CREATION OF SCHEMA AND TABLES BY Hibernate
-- IF spring.jpa.hibernate.ddl-auto IS SET TO create OR create-drop
-- IT IS A Hibernate feature (nothing to do with Spring)


--password for users and admin is: 123

INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('756289634' , 'Tom', 'Chelsie', '2104586995', 'tom.chelsie@gmail.com', 'admin', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Admin');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('201230586' , 'Bill', 'Tobias', '2101234567', 'toby.bill@gmail.com', 'bill_tobias', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('785210564' , 'George', 'Kopis', '2103326952', 'g.kopis@gmail.com', 'george_kopis', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('952102461' , 'Dean', 'Soras', '2104587558', 'soras.dean@gmail.com', 'dean_soras', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('250036544' , 'Nick', 'Wellow', '2103206598', 'nick85wellow@gmail.com', 'nick_wellow', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('982354761' , 'Peter', 'Simons', '2105568895', 'pet.simons@gmail.com', 'peter_simons', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('134965820' , 'Cate', 'Dublington', '2103562265', 'dublcate.1997@gmail.com', 'cate_dublington', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('758214602' , 'Maria', 'Pipers', '2103326969', 'mary.pipers@gmail.com', 'maria_pipers', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('362056902' , 'Simon', 'Maters', '2104587575', 'simaters@gmail.com', 'simon_maters', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('953245612' , 'Georgia', 'Tinkers', '2104521230', 'tinkers.geo@gmail.com', 'georgia_tinkers', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('520258964' , 'Chris', 'Senters', '2103320562', 'chr.senters@gmail.com', 'chris_senters', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('302301456' , 'Samantha', 'Kollins', '2105209630', 'samy.kollins@gmail.com', 'samantha_kollins', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('985862143' , 'Bruce', 'Waters', '2108524597', 'waters.br@gmail.com', 'bruce_waters', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');
INSERT INTO USER (membership_number, user_first_name, user_last_name, user_phone, user_email, user_username, user_password, user_role) VALUES ('751243602' , 'Zoe', 'Binkers', '2103256127', 'zoe98binkers@gmail.com', 'zoe_binkers', '$2a$10$WW8sQYAhCoVV6NmP9Npn8.waFXXqtSvPxhtPlsCRcivD8ApZekNkS', 'Member');






INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('35168', 'War and Peace','1867-06-25', 'Literary realism');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('26745', 'The Grapes of Wrath','1939-04-14', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('98634', 'Invisible Planets','2016-11-01', 'Science Fiction');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('68023', 'The Murderess', '1903-11-01', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('78021', 'Nosedive', '2014-07-06', 'Detective Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('33265', 'The Hobbit', '1989-08-01', 'Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('75682', 'Captain Michalis', '1950-05-01', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('02315', 'Crime and Punishment','1866-12-31', 'Literary realism');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('36040', 'Report to Greco', '1961-08-01', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('65742', 'Paradiso', '1320-07-30', 'Comedy');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('98025', 'The Last Temptation', '1951-03-01', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('55428', 'Aniara', '1998-11-01', 'Science Fiction');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('32865', 'Of Mice and Men','1937-01-08', 'Literary realism');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('75848', 'My Brilliant Friend','2011-10-19', 'Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('45812', 'Looking for Alaska','2005-03-03', 'Literary realism');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('45725', 'The Scientology Murders','2017-04-04', 'Detective Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('58216', 'Old Masters: A Comedy','1985-10-15', 'Comedy');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('52066', 'Broken Stars','2019-02-19', 'Science Fiction');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('30219', 'Blood Border','2014-12-24', 'Detective Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('39185', 'Madame Bovary','1856-05-03', 'Literary realism');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('39185', 'Twilight','2010-03-16', 'Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('55680', 'Anna Karenina','1877-10-16', 'Literary realism');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('55680', 'The Hole','2019-03-03', 'Science Fiction');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('62571', 'Christ Recrucified', '1962-01-01', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('75320', 'A Good Bunch of Men', '2018-07-21', 'Detective Novel');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('35246', 'Princess Isambo', '1945-02-01', 'Drama');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('55482', 'The Divine Comedy', '1320-08-01', 'Comedy');
INSERT INTO BOOK (book_pin, book_title, publication_date, book_category) VALUES ('32001', 'The Comedy of Errors', '1623-09-01', 'Comedy');






INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-29', 'In progress','35168', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-15', '2020-01-29', 'Completed','55680', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-29', 'In progress','39185', '985862143');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-15', '2020-01-29', 'In progress','35168', '985862143');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-15', '2020-01-29', 'In progress','39185', '520258964');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-28', 'In progress','55680', '520258964');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-30', 'In progress','55680', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-12-05', '2019-12-12', 'Completed','39185', '520258964');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-12-28', '2019-01-05', 'In progress','98025', '985862143');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-15', '2020-01-30', 'In progress','98025', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-10-18', '2019-10-25', 'Completed','35168', '250036544');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-30', 'In progress','35168', '751243602');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-11', '2020-01-18', 'In progress','39185', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-11-03', '2019-11-10', 'Completed','32865', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-07', '2020-01-14', 'In progress','45812', '520258964');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-10-11', '2019-10-19', 'Completed','45812', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-05', '2020-01-12', 'In progress','39185', '785210564');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-06-18', '2019-06-28', 'Completed','35168', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-22', '2020-01-29', 'In progress','26745', '785210564');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-22', '2020-01-28', 'In progress','35168', '302301456');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-08-12', '2019-08-19', 'Completed','26745', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-12-05', '2019-12-14', 'Completed','39185', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-22', '2020-01-28', 'In progress','39185', '785210564');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-05-17', '2019-05-24', 'Completed','02315', '362056902');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-23', '2020-01-30', 'In progress','32865', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-29', 'In progress','351680', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-11-15', '2019-11-23', 'Completed','39185', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-18', '2020-01-24', 'In progress','39185', '953245612');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-07', '2020-01-14', 'In progress','45812', '302301456');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-02-09', '2019-02-17', 'Completed','68023', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-07-03', '2019-07-10', 'Completed','35246', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-14', '2020-01-21', 'In progress','62571', '250036544');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-04-16', '2019-04-23', 'Completed','55680', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-13', '2020-01-20', 'In progress','26745', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-07-23', '2019-07-30', 'Completed','35246', '982354761');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-10-12', '2019-10-19', 'Completed','26745', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-18', '2020-01-26', 'In progress','75682', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-25', '2020-01-30', 'In progress','26745', '250036544');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-12', '2020-01-19', 'In progress','35168', '362056902');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-03-15', '2019-03-22', 'Completed','35168', '982354761');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-09-11', '2019-09-18', 'Completed','26745', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-16', '2020-01-23', 'In progress','62571', '250036544');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-16', '2020-01-22', 'In progress','35246', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-16', '2020-01-23', 'In progress','35246', '982354761');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2020-01-15', '2020-01-22', 'In progress','55680', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-10-05', '2019-10-12', 'Completed','26745', '134965820');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-11-18', '2019-11-25', 'Completed','32865', '982354761');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-09-20', '2019-09-27', 'Completed','02315', '201230586');
INSERT INTO BORROW (borrow_date, return_date, borrow_status, book_pin, membership_number) VALUES ('2019-02-16', '2019-02-23', 'Completed','35168', '134965820');