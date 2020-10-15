drop table if exists REST.t_pad_computer CASCADE;
drop table if exists REST.t_pad_os CASCADE ;
drop table if exists REST.t_pad_sound_card CASCADE ;
drop table if exists REST.t_pad_usb CASCADE;

/*
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 1 increment by 1;
-drop sequence if exists computer_sequence;
create sequence computer_sequence start with 1 increment by 1;
drop sequence if exists os_sequence;
create sequence os_sequence start with 1 increment by 1;
drop sequence if exists sound_card_sequence;
create sequence sound_card_sequence start with 1 increment by 1;
drop sequence if exists usb_sequence;
create sequence usb_sequence start with 1 increment by 1;*/
CREATE TABLE IF NOT EXISTS REST.t_pad_computer (id BIGINT not null AUTO_INCREMENT, state varchar(255), state_date_time timestamp, computer_type varchar(255), created_at timestamp, os_id BIGINT, sound_card_id BIGINT, primary key (id))  ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS REST.t_pad_os (id BIGINT not null AUTO_INCREMENT, created_at timestamp, end_date timestamp, name varchar(255), version varchar(255), primary key (id))  ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS REST.t_pad_sound_card (id BIGINT not null AUTO_INCREMENT, version varchar(255), usb_id BIGINT, primary key (id))  ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS REST.t_pad_usb (id BIGINT not null AUTO_INCREMENT, version varchar(255), primary key (id))  ENGINE = InnoDB;

commit;
alter table REST.t_pad_computer add constraint fk_os_id foreign key (os_id) references REST.t_pad_os(id);
alter table REST.t_pad_computer add constraint fk_sound_card_id foreign key (sound_card_id) references REST.t_pad_sound_card(id);
alter table REST.t_pad_sound_card add constraint fk_usb_id foreign key (usb_id) references REST.t_pad_usb(id);

commit;
INSERT INTO REST.t_pad_usb (id, version) VALUES
  (1, '1.0.0'),
  (2, '2.1.1'),
  (3, '3.2.1');

INSERT INTO REST.t_pad_sound_card (id, version, usb_id) VALUES
  (1, '1.0.0', 1),
  (2, 'A_2.1.1', 2),
  (3, '3.2.1', 3);

INSERT INTO REST.t_pad_os (id, created_at, end_date, name, version) VALUES
  (1, CURRENT_TIMESTAMP, NULL, 'Ubuntu','20.04_lts'),
  (2, CURRENT_TIMESTAMP, NULL, 'Debian','10_lts'),
  (3, CURRENT_TIMESTAMP, NULL, 'ArchLinux','5.4.69-1_lts'),
  (4, CURRENT_TIMESTAMP, NULL, 'Manjaro','18.1.0_lts'),
  (5, CURRENT_TIMESTAMP, NULL, 'Red Hat Enterprise Linux-RHEL','7'),
  (6, CURRENT_TIMESTAMP, NULL, 'CentOS','8.0'),
  (7, CURRENT_TIMESTAMP, NULL, 'Windows','10'),
  (8, CURRENT_TIMESTAMP, NULL, 'Windows Server','2019'),
  (9, CURRENT_TIMESTAMP, NULL, 'Android','11');


INSERT INTO REST.t_pad_computer (id, state, state_date_time, computer_type, created_at, os_id, sound_card_id) VALUES
  (1, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'PERSONAL_COMPUTER', TIMESTAMP('2019-01-01 13:00:01.999'), 1, 1),
  (2, 'INACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'AI_SUPER_PC', TIMESTAMP('2019-01-01 13:00:01.999'), 2, NULL),
  (3, 'DELETED', TIMESTAMP('2019-01-01 13:00:01.999'), 'TABLET', TIMESTAMP('2019-01-01 13:00:01.999'), 9, 2),
  (4, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'SERVER', TIMESTAMP('2019-01-01 13:00:01.999'), 5, NULL),
  (5, 'INACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'WORKSTATION', TIMESTAMP('2019-01-01 13:00:01.999'), NULL, NULL),
  (6, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'PERSONAL_COMPUTER', TIMESTAMP('2019-01-01 13:00:01.999'), 1, 3),
  (7, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'PERSONAL_COMPUTER', TIMESTAMP('2019-01-01 13:00:01.999'), 7, 1),
  (8, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'SERVER', TIMESTAMP('2019-01-01 13:00:01.999'), 6, NULL),
  (9, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'SERVER', TIMESTAMP('2019-01-01 13:00:01.999'), 3, NULL),
  (10, 'ACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'CELLULAR', TIMESTAMP('2019-01-01 13:00:01.999'), 9, 2),
  (11, 'INACTIVE', TIMESTAMP('2019-01-01 13:00:01.999'), 'CELLULAR', TIMESTAMP('2019-01-01 13:00:01.999'), 9, 2);
commit;
update REST.t_pad_computer set state = 'ACTIVE' where id in (1,3,4,6,7,8,9,10);
commit;