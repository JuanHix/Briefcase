create schema ecodosreto5;
use ecodosreto5;
create table Proveedor(
prov_id int primary key,
prov_nombre char(20),
prov_direccion char(45),
prov_telefono char(20));

insert into proveedor values(101, "Auteco","calle 7 No. 45-17", "05713224459");
insert into proveedor values(102, "Hitachi", "calle 19 No. 108-26", "05714223344");
insert into proveedor values(103, "Bosch", "carrera 68 No. 26-45", "05715678798");
insert into proveedor values(104, "Teco", "calle 77 No. 68-33", "05712213243");
insert into proveedor values(105, "General Electric", "calle 29 No. 26-12", "05717239919");