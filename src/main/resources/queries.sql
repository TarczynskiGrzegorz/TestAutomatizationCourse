use mydb;

-- 5 alter table
ALTER TABLE ledger_finish RENAME COLUMN prize to ledger_prize;
ALTER TABLE plastic_finish RENAME COLUMN prize to plastic_prize;
ALTER TABLE rims RENAME COLUMN prize to rims_prize;
ALTER TABLE wheels RENAME COLUMN prize to wheels_prize;
ALTER TABLE lights RENAME COLUMN prize to lights_prize;
ALTER TABLE car RENAME COLUMN prize to base_prize;

-- 10 statements for insertion.
INSERT INTO ledger_finish (name, ledger_prize) 
VALUES
('black ledger',100),
('white ledger',200);
INSERT INTO plastic_finish (name, plastic_prize) 
VALUES
('black plastic',2000),
('brown plastic',3000);
INSERT INTO interior_finish (plastic_finish_id, ledger_finish_id)
VALUES
(1,2),
(2,1),
(1,1),
(2,2);
INSERT INTO rims (model,rims_prize)
VALUES
('18',3000),
('20',5000);
INSERT INTO wheels (model,wheels_prize,rims_id)
VALUES
('18- runflat',5000,1),
('18-classic',3000,1);
INSERT INTO lights (model,lights_prize)
VALUES
('xeon',7000),
('classic',3000);
INSERT INTO exterior_color (color_name)
VALUES
('black'),
('red'),
('blue'),
('yellow'),
('grey'),
('dark'),
('light'),
('cynamon'),
('xxx'),
('vanilla'),
('strawberry'),
('orange'),
('purple'),
('green'),
('grey');
INSERT INTO model (name)
VALUES
('BMW X3'),
('BMW X4'),
('BMW X5');
INSERT INTO car (base_prize,model_id,color_id,lights_id,wheels_rims_id,wheels_id,interior_finish_id)
VALUES
(100000, 1,1,1,1,1,1),
(130000, 2,3,2,1,1,2),
(230000, 3,3,1,1,1,3);
INSERT INTO user (name,surname,email)
VALUES
('Jan','Nowak','123@gmail.com'),
('Alex','Djokovic','fb@gmail.com'),
('Leo','Suarez','rg@gmail.com');
INSERT INTO client (id,phone_number,user_id)
VALUES 
(1,1235678,1);
INSERT INTO cost_center (country,city)
VALUES 
('Germany','Berlin'),
('Germany','Hamburg');
INSERT INTO dealer (is_active,cost_center_id,user_id)
VALUES
(1,1,2),
(0,2,3);

INSERT INTO orders (car_id,client_id,dealer_id,orders_date)
VALUES
(1,1,1,'2024-10-10');

-- 10 statements for updating.
UPDATE ledger_finish SET ledger_prize = 1000 WHERE ledger_prize <150;
UPDATE ledger_finish SET ledger_prize = 2500 WHERE ledger_prize <250;
UPDATE plastic_finish SET plastic_prize = 2500 WHERE plastic_prize <2100;
UPDATE plastic_finish SET plastic_prize = 5000 WHERE plastic_prize >2100;
UPDATE lights SET lights_prize = 2500 WHERE lights_prize <3500;
UPDATE lights SET lights_prize = 7500 WHERE lights_prize >3500;
UPDATE user SET name = 'Olo' WHERE name = 'Leo';
UPDATE user SET name = 'Vlad' WHERE name = 'Olo';
UPDATE cost_center SET city = 'Frankfurt' WHERE city like 'Ham%';
UPDATE cost_center SET country = 'DU' WHERE country like 'Germ%';

-- 10 statements for deletions. 
DELETE FROM exterior_color WHERE id=4;
DELETE FROM exterior_color WHERE id=5;
DELETE FROM exterior_color WHERE id=6;
DELETE FROM exterior_color WHERE id=7;
DELETE FROM exterior_color WHERE id=8;
DELETE FROM exterior_color WHERE id=9;
DELETE FROM exterior_color WHERE id=10;
DELETE FROM exterior_color WHERE id=11;
DELETE FROM exterior_color WHERE id=12;
DELETE FROM exterior_color WHERE id=13;

-- 1 big statement to join all tables in the database. I give one big table but without all tables - that is just a repetition of below steps
select * from user join client on user.id= client.user_id join orders on orders.client_id = client.id join car on car.id = orders.car_id join model on model.id = car.model_id join lights on lights.id = car.lights_id;
-- 5 statements with left, right, inner, outer joins.
Select * from interior_finish as i_f join plastic_finish as p_f on i_f.plastic_finish_id = p_f.id; 
select * from exterior_color as e_c left join car on e_c.id = car.color_id;
select * from exterior_color as e_c right join car on e_c.id = car.color_id;
select * from car inner join exterior_color as e_c on car.color_id = e_c.id;
select user.id from user union select dealer.user_id from dealer;
-- outer join doesnt work in workbench : select * from dealer full outer join user on dealer.user_id = user.id;

-- 7 statements with aggregate functions and group by and without having.
select  count(*) , ledger_finish.name from interior_finish left join ledger_finish on interior_finish.ledger_finish_id = ledger_finish.id group by ledger_finish.name;
select  count(*) , plastic_finish.name from interior_finish left join plastic_finish on interior_finish.plastic_finish_id = plastic_finish.id group by plastic_finish.name;
select car.model_id, count(*) from car group by car.model_id;
select car.color_id, count(*) from car group by car.color_id;
select car.lights_id, count(*) from car group by car.lights_id;
select car.wheels_id, count(*) from car group by car.wheels_id;
select car.interior_finish_id, count(*) from car group by car.interior_finish_id;
-- 7 statements with aggregate functions and group by and with having.
select  count(*) , ledger_finish.name from interior_finish left join ledger_finish on interior_finish.ledger_finish_id = ledger_finish.id group by ledger_finish.name having size>1;
select  count(*) , plastic_finish.name from interior_finish left join plastic_finish on interior_finish.plastic_finish_id = plastic_finish.id group by plastic_finish.name having size>1;
select car.model_id, count(*) as size from car group by car.model_id having size>1;
select car.color_id, count(*) as size  from car group by car.color_id having size>1;
select car.lights_id, count(*) as size  from car group by car.lights_id having size>1;
select car.wheels_id, count(*) as size  from car group by car.wheels_id having size>1;
select car.interior_finish_id, count(*) as size  from car group by car.interior_finish_id having size>1;