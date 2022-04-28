INSERT INTO "user"."user" (id, name, email)
values ('7b6678d4-b86c-4167-937c-3c2038bee81e', 'Peter Parker', 'peter.parker@gmail.com'),
       ('a46340ce-5a08-495a-a9b5-8d76bcfde4d2', 'Bruce Banner', 'bruce.wayner@gmail.com'),
       ('602bb094-6dbc-457f-a730-0cc806eebdd0', 'Thor Odinson', 'thor.odinson@gmail.com');

INSERT INTO "contract"."contract" (id, "value", user_id)
values ('f667ca9c-4c0a-4673-a923-6d633a2e3996', 10000.00, '7b6678d4-b86c-4167-937c-3c2038bee81e'),
       ('4fdcfb54-0479-4591-b433-4e86db5ce2f1', 50000.00, 'a46340ce-5a08-495a-a9b5-8d76bcfde4d2'),
       ('1d6c0da0-93e8-4ff2-bd4f-970b9e4ccbd1', 5000.00, 'a46340ce-5a08-495a-a9b5-8d76bcfde4d2');
