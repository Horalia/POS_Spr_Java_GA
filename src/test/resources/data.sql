INSERT INTO POS.INVENTORY
(SKU, AVAILABLE, COST, NAME)
VALUES(1235, 10, 34.95, 'Kuromi Halloween Blanket 1')
,(1236,6,16.95,'My Melody Cookie Jar')
,(1238,9,23.45,'Cinnamoroll Night Ligh Stand')
,(1240,40,2.45,'Hello Kitty Ramune Drink')
,(1241,23,7.95,'Hello Kitty Lanyard')
,(1242,50,15.31,'Hello Kitty 8in Plush Summer');


INSERT INTO POS.TRANSACTIONS
(PAYMENT,`METHOD`,`DATE`)
        VALUES (55.95,'cash', '2023-12-12');

