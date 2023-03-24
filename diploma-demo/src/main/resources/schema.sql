drop table if exists card;
create table card (
    id       bigint auto_increment primary key,
    name varchar(255)
);
drop table if exists sale_point;
create table sale_point(
    id   bigint auto_increment primary key,
    name varchar(255)
);
drop table if exists cashback;
create table cashback (
    id        bigint auto_increment primary key,
    value_cashback bigint,
    card_id bigint,
    sale_point_id  bigint,
    foreign key (card_id) references card (id),
    foreign key (sale_point_id) references sale_point (id)
);