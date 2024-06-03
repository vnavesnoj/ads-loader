INSERT INTO filter(instant, platform, pattern)
VALUES (now(), 'OLX', '{
  "1dummy1": "dummy1",
  "1dummy2": "dummy2"
}'),
       (now(), 'OLX', '{
         "2dummy1": "dummy1",
         "2dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "3dummy1": "dummy1",
         "3dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "4dummy1": "dummy1",
         "4dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "5dummy1": "dummy1",
         "5dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "6dummy1": "dummy1",
         "6dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "7dummy1": "dummy1",
         "7dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "8dummy1": "dummy1",
         "8dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "9dummy1": "dummy1",
         "9dummy2": "dummy2"
       }'),
       (now(), 'OLX', '{
         "10dummy1": "dummy1",
         "10dummy2": "dummy2"
       }');

INSERT INTO ad(platform, url, title, pushup_time, instant, hash)
VALUES ('OLX', 'url1', 'title1', now(), now(), 1),
       ('OLX', 'url2', 'title2', now(), now(), 2),
       ('OLX', 'url3', 'title3', now(), now(), 3),
       ('OLX', 'url4', 'title4', now(), now(), 4),
       ('OLX', 'url5', 'title5', now(), now(), 5),
       ('OLX', 'url6', 'title6', now(), now(), 6),
       ('OLX', 'url7', 'title7', now(), now(), 7),
       ('OLX', 'url8', 'title8', now(), now(), 8),
       ('OLX', 'url9', 'title9', now(), now(), 9),
       ('OLX', 'url10', 'title10', now(), now(), 10),
       ('OLX', 'url11', 'title11', now(), now(), 11),
       ('OLX', 'url12', 'title12', now(), now(), 12),
       ('OLX', 'url13', 'title13', now(), now(), 13),
       ('OLX', 'url14', 'title14', now(), now(), 14),
       ('OLX', 'url15', 'title15', now(), now(), 15),
       ('OLX', 'url16', 'title16', now(), now(), 16),
       ('OLX', 'url17', 'title17', now(), now(), 17),
       ('OLX', 'url18', 'title18', now(), now(), 18),
       ('OLX', 'url19', 'title19', now(), now(), 19),
       ('OLX', 'url20', 'title20', now(), now(), 19);

INSERT INTO ad_info(ad_id, info)
VALUES ((SELECT id FROM ad WHERE url = 'url1'), '{
  "1dummy1": "dummy1",
  "1dummy2": "dummy2"
}'),
       ((SELECT id FROM ad WHERE url = 'url2'), '{
         "2dummy1": "dummy1",
         "2dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url3'), '{
         "3dummy1": "dummy1",
         "3dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url4'), '{
         "4dummy1": "dummy1",
         "4dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url5'), '{
         "5dummy1": "dummy1",
         "5dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url6'), '{
         "6dummy1": "dummy1",
         "6dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url7'), '{
         "7dummy1": "dummy1",
         "7dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url8'), '{
         "8dummy1": "dummy1",
         "8dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url9'), '{
         "9dummy1": "dummy1",
         "9dummy2": "dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url10'), '{
         "dummy1": "0dummy1",
         "dummy2": "0dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url11'), '{
         "dummy1": "1dummy1",
         "dummy2": "1dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url12'), '{
         "dummy1": "2dummy1",
         "dummy2": "2dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url13'), '{
         "dummy1": "3dummy1",
         "dummy2": "3dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url14'), '{
         "dummy1": "4dummy1",
         "dummy2": "4dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url15'), '{
         "dummy1": "5dummy1",
         "dummy2": "5dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url16'), '{
         "dummy1": "6dummy1",
         "dummy2": "6dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url17'), '{
         "dummy1": "7dummy1",
         "dummy2": "7dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url18'), '{
         "dummy1": "8dummy1",
         "dummy2": "8dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url19'), '{
         "dummy1": "9dummy1",
         "dummy2": "9dummy2"
       }'),
       ((SELECT id FROM ad WHERE url = 'url20'), '{
         "dummy1": "dummy1",
         "dummy2": "dummy2"
       }');

INSERT INTO filter_ad(instant, ad_url, filter_id)
VALUES (now(), 'url1', 1),
       (now(), 'url2', 1),
       (now(), 'url2', 2),
       (now(), 'url3', 1),
       (now(), 'url3', 2),
       (now(), 'url3', 3),
       (now(), 'url4', 4),
       (now(), 'url5', 5),
       (now(), 'url6', 6),
       (now(), 'url7', 7),
       (now(), 'url8', 8),
       (now(), 'url9', 9),
       (now(), 'url10', 1),
       (now(), 'url11', 1),
       (now(), 'url12', 1),
       (now(), 'url13', 1),
       (now(), 'url14', 1),
       (now(), 'url15', 1),
       (now(), 'url16', 2),
       (now(), 'url17', 2),
       (now(), 'url18', 2),
       (now(), 'url19', 2),
       (now(), 'url20', 2);