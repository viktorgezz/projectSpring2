CREATE TABLE People(
    people_id int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    name varchar(200) NOT NULL UNIQUE,
    date_of_birth int CHECK ( date_of_birth > 0)
);

CREATE TABLE Book(
    book_id int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    people_id int REFERENCES People(people_id) on DELETE set null,
    title varchar(200) NOT NULL,
    author varchar(200) NOT NULL,
    date_creation int CHECK ( date_creation >= 0 )
);

ALTER TABLE Book ADD date_take DATE;