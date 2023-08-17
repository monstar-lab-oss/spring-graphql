CREATE TABLE books
(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100),
    page_count INTEGER,
    author_id BIGINT NOT NULL,
    CONSTRAINT fk_authors
      FOREIGN KEY(author_id)
	  REFERENCES authors(id)
	  ON DELETE CASCADE
);
