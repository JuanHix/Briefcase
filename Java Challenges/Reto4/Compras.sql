create table compras(
id int primary key,
username char(20),
fabricante char(20),
fecha_hora timestamp,
foreign key (username) references clientes (username),
foreign key (fabricante) references fabricantes (fabricante));

insert into compras values (101,"lucky","Cannondale","2017-10-25 20:00:00");
insert into compras values (102,"lucky","Trek","2019-03-15 18:30:00");
insert into compras values (103,"lucky","Starker",'2019-05-20 20:30:00');
insert into compras values (104,"malopez","Cannondale",'2018-05-20 20:30:00');
insert into compras values (105,"malopez","Starker",'2020-01-20 20:30:00');
insert into compras values (106,"diva","Yeti",'2019-05-20 20:30:00');
insert into compras values (107,"diva","Fuji",'2018-06-22 21:30:00');
insert into compras values (108,"diva","Lucky Lion",'2020-03-17 15:30:20');
insert into compras values (109,"dreamer","Lucky Lion",'2020-03-17 15:30:20');
insert into compras values (110,"dreamer","Be Electric",'2020-04-10 18:30:20');
insert into compras values (111,"ninja","Aima",'2020-02-17 20:30:20');
insert into compras values (112,"ninja","Starker",'2020-02-20 16:30:20');
insert into compras values (113,"ninja","Mec de Colombia",'2020-03-27 18:30:20');
insert into compras values (114,"rose","Atom Electric",'2020-03-20 21:30:20');
insert into compras values (115,"green","Yeti",'2020-01-10 17:30:20');
insert into compras values (116,"green","Trek",'2020-02-15 20:30:20');
insert into compras values (117,"green","Bmc",'2020-03-17 18:30:20');

