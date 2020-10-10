CREATE TABLE IF NOT EXISTS scrobbles (
    id serial PRIMARY KEY,
    json_data jsonb NOT NULL
);