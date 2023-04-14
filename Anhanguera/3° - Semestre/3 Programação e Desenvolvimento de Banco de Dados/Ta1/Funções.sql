USE world;

Show tables;
show columns from city;

SELECT * FROM world.city;

SELECT Name
FROM city
WHERE Name LIKE 'sor%';

SELECT Name, population
FROM city
WHERE Name LIKE 'sor%';

SELECT city.Name, city.population, country.Name
FROM city, country
WHERE city.Name LIKE 'sor%' and  city.CountryCode = country.code;