INSERT INTO addresses (_id, street, _number, city, zip_code) VALUES (1, 'Nova ulica', 'BB', 1, '220000');
INSERT INTO addresses (_id, street, _number, city, zip_code) VALUES (2, 'Jovana Jovanovica Zmaja', '45', 2, '21000');
INSERT INTO addresses (_id, street, _number, city, zip_code) VALUES (3, 'Jovana Jovanovica Zmaja', '45', 3, '21000');
INSERT INTO addresses (_id, street, _number, city, zip_code) VALUES (4, 'Jovana Jovanovica Zmaja', '45', 4, '21000');

INSERT INTO locations (_id, latitude, longitude, address_id) VALUES (1, 48.423, 100.32, 1);
INSERT INTO locations (_id, latitude, longitude, address_id) VALUES (2, 48.4593, 150.32, 2);
INSERT INTO locations (_id, latitude, longitude, address_id) VALUES (3, 48.4343, 140.32, 3);
INSERT INTO locations (_id, latitude, longitude, address_id) VALUES (4, 48.4433, 104.32, 4);

INSERT INTO programming_languages (_id, programming_language_name) VALUES (1, 'JavaScript');
INSERT INTO programming_languages (_id, programming_language_name) VALUES (2, 'Java');
INSERT INTO programming_languages (_id, programming_language_name) VALUES (3, 'C#');

INSERT INTO software_companies (_id, company_name, company_type, location_id) VALUES (1, 'Symphony', 1, 1);
INSERT INTO software_companies (_id, company_name, company_type, location_id) VALUES (2, 'Levi9', 1, 2);
INSERT INTO software_companies (_id, company_name, company_type, location_id) VALUES (3, 'Execom', 1, 3);