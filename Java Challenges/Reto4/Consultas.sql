select "Consulta 1";
select fabricante from fabricantes order by fabricante;
select "Consulta 2";
select fabricante,precio,año from bicicletas where Año >= 2019 order by fabricante;
select "Consulta 3";
select fabricante from motocicletas where id_prov = 101;
select "Consulta 4";
select fabricante from intencion_compras where username = "lucky" order by fabricante;
select "Consulta 5";
select c.Username, c.Nombre, c.Apellido from Clientes c, compras p where p.username = c.username and p.fabricante="Yeti" order by Nombre;
select "Consulta 6";
select count(fabricante) from bicicletas where año >= 2019;