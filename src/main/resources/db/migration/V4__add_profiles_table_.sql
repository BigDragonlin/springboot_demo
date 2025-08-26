create table profiles
(
    id        bigint auto_increment
        primary key,
    bio       text null,
    phone_number varchar(15) null,
    data_of_birth date null,
    loyalty_points int unsigned default 0,
    foreign key (id) references users (id)
);

