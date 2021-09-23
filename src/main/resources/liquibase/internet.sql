DROP TABLE IF EXISTS `internet`;

CREATE TABLE `internet`
(
    `id`      mediumint(8) unsigned NOT NULL auto_increment,
    `user_id` INTEGER REFERENCES customer (id),
    `device`  TEXT default NULL,
    PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `internet` (`user_id`, `device`)
VALUES ((select id from subscriber where id = 5, "phone"),
       ((select id from subscriber where id = 18, "phone"),
       ((select id from subscriber where id = 16, "laptop"),
       ((select id from subscriber where id = 23, "laptop"),
       ((select id from subscriber where id = 20, "computer"),
       ((select id from subscriber where id = 23, "computer"),
       ((select id from subscriber where id = 3, "tablet"),
       ((select id from subscriber where id = 1, "tablet"),
       ((select id from subscriber where id = 14, "phone"),
       ((select id from subscriber where id = 18, "phone");
INSERT INTO `internet` (`user_id`, `device`)
VALUES ((select id from subscriber where id = 6), "laptop"),
       ((select id from subscriber where id = 23), "laptop"),
       ((select id from subscriber where id = 7), "computer"),
       ((select id from subscriber where id = 23), "computer"),
       ((select id from subscriber where id = 16), "tablet"),
       ((select id from subscriber where id = 25), "tablet"),
       ((select id from subscriber where id = 19), "phone"),
       ((select id from subscriber where id = 13), "phone"),
       ((select id from subscriber where id = 7), "laptop"),
       ((select id from subscriber where id = 8), "laptop");
