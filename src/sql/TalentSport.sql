create database TalentSport;
use TalentSport;

create table users (
                       id int primary key auto_increment NOT NULL,
                       nom varchar(255)NOT NULL,
                       prenom varchar(255) NOT NULL,
                       email varchar(255) NOT NULL,
                       password varchar(255) NOT NULL,
                       role ENUM("member", "entraineur") NOT NULL
);

create table members (
                         id_member int primary key auto_increment NOT NULL,
                         date varchar(50) not null,
                         sport varchar(255)
);

create table entraineurs (
                             id_entraineur int primary key auto_increment NOT NULL,
                             specailite varchar(255)

);
create table seainces (
                          id_seainces int primary key auto_increment not null,
                          id_member int ,
                          id_entraineur int,
                          date varchar(50),
                          foreign key (id_member) references members(id_member),
                          foreign key (id_entraineur) references entraineurs(id_entraineur)
);

