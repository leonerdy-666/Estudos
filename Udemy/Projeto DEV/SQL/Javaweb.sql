select * from login;

insert login values
(1, 'Leonardo', '123456', '1'),
(2, 'Caroline', '123456', '2'),
(3, 'Amanda', '123456', '3'),
(4, 'Jenifer', '123456', '4'),
(5, 'Matheus', '123456', '5'),
(6, 'Fernando', '123456', '6');

truncate login;

select * from login;

delete from login where log_codigo = 2;