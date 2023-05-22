CREATE TABLE login(

log_codigo integer not null,
log_usuario character varying (10) not null,
log_senha character varying (10) not null,
log_nivelacesso character (1),
constraint pk_login primary key (log_codigo)
)