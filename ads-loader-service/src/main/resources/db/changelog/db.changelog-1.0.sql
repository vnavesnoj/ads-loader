--liquibase formatted sql

--changeset vnavesnoj:1
CREATE TABLE ad
(
    id          BIGSERIAL PRIMARY KEY,
    platform    VARCHAR(7)   NOT NULL,
    url         VARCHAR(255) NOT NULL UNIQUE,
    title       VARCHAR(63)  NOT NULL,
    pushup_time TIMESTAMP,
    instant     TIMESTAMP    NOT NULL,
    hash        INT          NOT NULL
);

--changeset vnavesnoj:2
CREATE TABLE ad_info
(
    ad_id BIGINT PRIMARY KEY REFERENCES ad ON DELETE CASCADE,
    info  JSONB NOT NULL
)