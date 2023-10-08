-- Insertion pour la table car
INSERT INTO CAR (licence_plate, licence_plate_number, licence_plate_letters, city_identification_number, serial_number, transport_type, driver_number, color) VALUES
                                                                                                                                                                  ('12345-AB-01', '12345', 'AB', '01', 'SN123456789012345', 'YANGO', '1', 'Rouge'),
                                                                                                                                                                  ('67890-CD-02', '67890', 'CD', '02', 'SN234567890123456', 'YANGO', '2', 'Bleu'),
                                                                                                                                                                  ('11223-EF-03', '11223', 'EF', '03', 'SN345678901234567', 'YANGO', '1', 'Vert'),
                                                                                                                                                                  ('44556-GH-04', '44556', 'GH', '04', 'SN456789012345678', 'YANGO', '1', 'Jaune'),
                                                                                                                                                                  ('78901-IJ-05', '78901', 'IJ', '05', 'SN567890123456789', 'YANGO', '2', 'Noir');

-- Insertion pour la table driver
INSERT INTO DRIVER (first_name, last_name, birthday, experience_driving_number, cell_phone, address) VALUES
                                                                                             ('Jean', 'Dupont', '1980-01-15', '5', '0123456789', '1 rue de Paris'),
                                                                                             ('Marie', 'Durand', '1985-05-20', '7', '0234567890', '2 avenue de Lyon'),
                                                                                             ('Paul', 'Martin', '1978-11-12', '10', '0345678901', '3 boulevard de Marseille'),
                                                                                             ('Alice', 'Petit', '1992-08-09', '3', '0456789012', '4 place de Bordeaux'),
                                                                                             ('Robert', 'Blanc', '1982-03-22', '6', '0567890123', '5 chemin de Lille'),
                                                                                             ('Pierre', 'Noir', '1989-04-18', '4', '0678901234', '6 impasse de Nantes'),
                                                                                             ('Julie', 'Vert', '1990-09-05', '3', '0789012345', '7 rue de Strasbourg'),
                                                                                             ('Michel', 'Brun', '1987-06-11', '8', '0890123456', '8 avenue de Toulouse'),
                                                                                             ('Sophie', 'Bleu', '1983-02-17', '5', '0901234567', '9 boulevard de Nice'),
                                                                                             ('Luc', 'Rouge', '1995-12-25', '1', '0912345678', '10 place de Montpellier');

-- Insertion pour la table driver_car (associant chaque voiture à deux chauffeurs)
INSERT INTO DRIVER_CAR (car_id, driver_id, associated_date) VALUES
                                               (1, 1, '1980-01-15'),
                                               (1, 2, '1980-01-15'),
                                               (1, 3, '1980-01-15'),
                                               (2, 3, '1980-01-15'),
                                               (2, 4, '1980-01-15'),
                                               (3, 5, '1980-01-15'),
                                               (3, 6, '1980-01-15'),
                                               (4, 7, '1980-01-15'),
                                               (4, 8, '1980-01-15'),
                                               (5, 9, '1980-01-15'),
                                               (5, 10, '1980-01-15');
