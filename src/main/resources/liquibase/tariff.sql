DROP TABLE IF EXISTS `tariff`;

CREATE TABLE `tariff` (
                          `id` mediumint(8) unsigned NOT NULL auto_increment,
                          `title` TEXT default NULL,
                          `calls` mediumint default NULL,
                          `internet` mediumint default NULL,
                          `sms` mediumint default NULL,
                          PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("malesuada",157,260,80),
("amet",123,297,92),
("neque",127,372,50),
("pede,",125,402,94),
("Donec",122,319,99),
("gravida",187,390,60),
("aliquet,",167,421,81),
("elit.",184,155,58),
("molestie",196,375,88),
("montes,",139,363,97);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("erat.",103,253,50),
("semper.",106,182,73),
("vehicula",161,268,76),
("Mauris",142,475,84),
("Nulla",197,332,61),
("mollis.",159,228,86),
("a",110,268,54),
("tempus",173,144,75),
("adipiscing",117,457,90),
("nunc",106,344,59);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("Nam",152,250,61),
("Curabitur",125,464,97),
("ac",164,389,72),
("ut",149,339,75),
("accumsan",168,333,97),
("dictum",100,429,77),
("lacus",166,178,99),
("senectus",103,366,75),
("inceptos",153,324,85),
("aliquet,",197,342,88);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("Duis",106,233,80),
("dui.",194,415,52),
("eu",143,220,57),
("et",189,425,93),
("quis",117,454,57),
("Phasellus",136,234,80),
("non",158,146,50),
("nunc",100,277,59),
("felis",198,146,52),
("tempus",193,277,57);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("non,",165,304,99),
("Sed",166,366,78),
("eu,",136,379,90),
("sit",136,181,78),
("aliquet",113,210,68),
("cursus.",130,161,62),
("dui",105,215,89),
("bibendum",137,450,75),
("Cras",103,173,67),
("a",170,452,62);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("nec",123,149,82),
("placerat",112,410,90),
("amet,",112,334,62),
("sem.",106,401,87),
("amet",101,282,66),
("Donec",102,102,87),
("nibh",138,329,91),
("eu",100,401,60),
("eu",173,125,83),
("Donec",108,114,78);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("semper",165,386,83),
("rutrum",167,334,93),
("consequat",156,267,57),
("congue.",149,212,60),
("arcu",118,147,64),
("enim",120,205,71),
("faucibus",117,334,92),
("vehicula",127,309,97),
("Proin",134,425,65),
("elit,",109,137,81);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("Nam",148,229,77),
("libero",149,403,52),
("eleifend",163,421,62),
("Donec",183,420,54),
("enim",161,159,64),
("turpis",197,352,60),
("est.",153,356,55),
("mus.",172,377,90),
("egestas",183,421,65),
("pharetra",149,361,78);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("Fusce",132,443,90),
("ornare",122,279,60),
("lectus",165,326,57),
("Integer",171,366,88),
("odio.",137,349,88),
("ligula",102,211,68),
("odio,",169,288,74),
("luctus",125,499,68),
("enim.",190,334,64),
("mollis.",143,417,79);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("justo.",182,348,85),
("lobortis",175,469,66),
("a,",176,226,78),
("nec,",138,134,62),
("Nullam",143,345,83),
("Quisque",129,328,53),
("ut",137,125,82),
("et",175,426,93),
("pede,",196,348,78),
("Lorem",197,361,63);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("euismod",101,166,95),
("eu,",173,208,73),
("felis",140,196,84),
("id,",172,396,94),
("sagittis.",102,408,71),
("Nunc",138,218,98),
("Quisque",101,363,50),
("lobortis,",186,357,63),
("scelerisque",145,108,90),
("nisi.",165,241,97);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("vulputate,",131,460,84),
("semper",112,477,69),
("felis",141,374,59),
("interdum.",196,449,63),
("massa.",105,427,86),
("imperdiet,",191,177,75),
("porta",133,472,98),
("libero",187,151,95),
("Sed",199,213,73),
("non",114,419,71);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("nunc",115,207,91),
("nisi",127,295,95),
("lorem,",122,345,53),
("orci,",143,235,83),
("ut",143,457,74),
("vitae,",121,163,92),
("egestas",124,232,67),
("ornare,",187,432,66),
("lectus,",133,149,86),
("arcu.",182,413,81);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("lorem",188,302,62),
("mauris",155,456,71),
("ante,",101,208,72),
("accumsan",121,125,81),
("orci.",153,214,66),
("Aliquam",199,190,82),
("convallis",191,228,98),
("non,",164,341,66),
("id",175,403,51),
("mollis",170,112,76);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("elit.",170,303,82),
("ante.",108,370,86),
("vulputate",151,174,64),
("egestas",163,424,75),
("pede.",106,390,72),
("Lorem",169,392,72),
("a",129,463,98),
("Aliquam",137,238,84),
("Duis",145,282,78),
("risus.",149,169,50);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("id",156,159,74),
("accumsan",100,352,68),
("ante",170,340,55),
("leo,",193,291,56),
("et",106,268,57),
("ac",104,138,51),
("metus.",121,333,97),
("mi.",191,268,82),
("non",146,358,53),
("eu",161,323,86);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("Cras",167,136,51),
("sit",150,132,82),
("elit,",178,345,100),
("aliquet",120,398,58),
("pellentesque",181,121,51),
("ligula.",176,418,94),
("sit",107,226,83),
("nec,",196,306,61),
("consectetuer",143,126,54),
("velit",170,455,85);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("quam.",187,423,89),
("ornare",190,117,77),
("sollicitudin",154,106,81),
("sodales",188,278,87),
("leo.",122,277,83),
("velit.",169,114,53),
("purus",102,235,70),
("risus",101,297,93),
("aliquet,",192,349,80),
("nascetur",123,257,65);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("lobortis",163,374,59),
("ut,",135,481,56),
("aliquet.",171,291,80),
("purus",162,314,86),
("interdum.",177,264,63),
("lacus.",132,315,99),
("eleifend",148,456,66),
("lobortis",146,306,83),
("id",143,286,73),
("orci",187,170,85);
INSERT INTO `tariff` (`title`,`calls`,`internet`,`sms`)
VALUES
("massa",198,260,88),
("lorem",189,233,64),
("dictum",144,486,90),
("ligula.",168,243,64),
("Nunc",139,120,88),
("nisi.",178,369,90),
("rutrum",111,170,80),
("bibendum",162,435,77),
("Morbi",186,364,76),
("ipsum.",134,228,86);
