CREATE SCHEMA "user";

CREATE TABLE "user"."user"
(
    id    UUID        NOT NULL
        CONSTRAINT pk_user PRIMARY KEY,
    name  VARCHAR(50) NOT NULL,
    email VARCHAR(50)
);

CREATE SCHEMA "contract";

CREATE TABLE "contract"."contract"
(
    id      UUID       NOT NULL
        CONSTRAINT pk_contract PRIMARY KEY,
    value   DECIMAL(13, 5) NOT NULL,
    user_id UUID       NOT NULL
        CONSTRAINT fk_user_id REFERENCES "user"."user" (id)
);

