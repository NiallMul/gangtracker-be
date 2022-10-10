CREATE DATABASE IF NOT EXISTS `gangtracker`;

CREATE USER 'niall'@'localhost' IDENTIFIED BY 'local';
GRANT ALL ON *.* TO 'niall'@'%';
