INSERT INTO books(id, book_name, author) values (1, 'Book-A', 'Author-A');
INSERT INTO books(id, book_name, author) values (2, 'Book-B', 'Author-B');

INSERT INTO book_detail(id, page_no, page_detail, book_id) values (1, 1, 'Welcome to Introduction of Book-A...', 1);
INSERT INTO book_detail(id, page_no, page_detail, book_id) values (2, 2, 'This Page going to share of Book-A...', 1);

INSERT INTO book_detail(id, page_no, page_detail, book_id) values (3, 1, 'Welcome to Introduction of Book-B...', 2);
INSERT INTO book_detail(id, page_no, page_detail, book_id) values (4, 2, 'This Page going to share of Book-B...', 2);
INSERT INTO book_detail(id, page_no, page_detail, book_id) values (5, 3, 'This Page contains data of Book-B...', 2);
