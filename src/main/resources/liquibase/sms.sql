DROP TABLE IF EXISTS "sms";

CREATE TABLE "sms"
(
    id           SERIAL PRIMARY KEY,
    caller_id    INTEGER REFERENCES customer (id),
    companion_id INTEGER REFERENCES customer (id)
);

insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 20), (select id from customer where id = 12));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 33), (select id from customer where id = 5));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 22), (select id from customer where id = 6));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 12), (select id from customer where id = 7));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 11));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 12), (select id from customer where id = 13));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 22), (select id from customer where id = 21));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 15));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 23), (select id from customer where id = 13));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 21), (select id from customer where id = 10));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 3), (select id from customer where id = 1));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 4), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 20), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 12), (select id from customer where id = 4));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 22), (select id from customer where id = 22));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 12), (select id from customer where id = 12));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 23));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 14), (select id from customer where id = 3));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 10), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 5));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 23), (select id from customer where id = 3));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 9));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 2), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 4), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 15));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 23), (select id from customer where id = 13));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 21), (select id from customer where id = 10));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 3), (select id from customer where id = 1));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 4), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 20), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 15), (select id from customer where id = 4));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 14), (select id from customer where id = 3));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 10), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 5));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 23), (select id from customer where id = 3));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 10));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 2), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 4), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 15));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 23), (select id from customer where id = 13));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 21), (select id from customer where id = 10));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 3), (select id from customer where id = 1));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 4), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 20), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 12), (select id from customer where id = 4));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 22), (select id from customer where id = 22));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 12), (select id from customer where id = 12));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 23));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 14), (select id from customer where id = 3));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 10), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 5));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 23), (select id from customer where id = 3));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 1), (select id from customer where id = 9));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 2), (select id from customer where id = 2));
insert into calls (caller_id, companion_id)
values ((select id from subscriber where id = 4), (select id from customer where id = 2));