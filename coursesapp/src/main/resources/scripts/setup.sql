CREATE DATABASE courses_api_dev;
CREATE DATABASE courses_api_prod;

CREATE USER 'crs_dev_user'@'localhost' IDENTIFIED BY 'coursesapi';
CREATE USER 'crs_prod_user'@'localhost' IDENTIFIED BY 'coursesapi';
CREATE USER 'crs_dev_user'@'%' IDENTIFIED BY 'coursesapi';
CREATE USER 'crs_prod_user'@'%' IDENTIFIED BY 'coursesapi';

GRANT SELECT ON courses_api_dev.* to 'crs_dev_user'@'localhost';
GRANT INSERT ON courses_api_dev.* to 'crs_dev_user'@'localhost';
GRANT DELETE ON courses_api_dev.* to 'crs_dev_user'@'localhost';
GRANT UPDATE ON courses_api_dev.* to 'crs_dev_user'@'localhost';
GRANT SELECT ON courses_api_prod.* to 'crs_prod_user'@'localhost';
GRANT INSERT ON courses_api_prod.* to 'crs_prod_user'@'localhost';
GRANT DELETE ON courses_api_prod.* to 'crs_prod_user'@'localhost';
GRANT UPDATE ON courses_api_prod.* to 'crs_prod_user'@'localhost';
GRANT SELECT ON courses_api_dev.* to 'crs_dev_user'@'%';
GRANT INSERT ON courses_api_dev.* to 'crs_dev_user'@'%';
GRANT DELETE ON courses_api_dev.* to 'crs_dev_user'@'%';
GRANT UPDATE ON courses_api_dev.* to 'crs_dev_user'@'%';
GRANT SELECT ON courses_api_prod.* to 'crs_prod_user'@'%';
GRANT INSERT ON courses_api_prod.* to 'crs_prod_user'@'%';
GRANT DELETE ON courses_api_prod.* to 'crs_prod_user'@'%';
GRANT UPDATE ON courses_api_prod.* to 'crs_prod_user'@'%';