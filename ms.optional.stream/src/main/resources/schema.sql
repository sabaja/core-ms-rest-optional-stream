drop table if exists t_pad_computer CASCADE 
drop table if exists t_pad_os CASCADE 
drop table if exists t_pad_sound_card CASCADE 
drop table if exists t_pad_usb CASCADE
drop sequence if exists hibernate_sequence
create sequence hibernate_sequence start with 1 increment by 1
drop sequence if exists computer_sequence
create sequence computer_sequence start with 1 increment by 1
drop sequence if exists os_sequence
create sequence os_sequence start with 1 increment by 1
drop sequence if exists sound_card_sequence
create sequence sound_card_sequence start with 1 increment by 1
drop sequence if exists usb_sequence
create sequence usb_sequence start with 1 increment by 1
create table t_pad_computer (id decimal(19,2) not null IDENTITY, state varchar(255), state_date_time timestamp, computer_type varchar(255), created_at timestamp, os_id decimal(19,2), sound_card_id decimal(19,2), primary key (id))
create table t_pad_os (id decimal(19,2) not null IDENTITY, created_at timestamp, end_date timestamp, name varchar(255), version varchar(255), primary key (id))
create table t_pad_sound_card (id decimal(19,2) not null IDENTITY, version varchar(255), usb_id decimal(19,2), primary key (id))
create table t_pad_usb (id decimal(19,2) not null IDENTITY, version varchar(255), primary key (id))
alter table t_pad_computer add constraint FKstis0mdh11s696adxe5kk1xh6 foreign key (os_id) references t_pad_os
alter table t_pad_computer add constraint FKjh65v7kiwab45h7gj4hwl2mov foreign key (sound_card_id) references t_pad_sound_card
alter table t_pad_sound_card add constraint FKbjco95fjauuwidlbooql92thi foreign key (usb_id) references t_pad_usb