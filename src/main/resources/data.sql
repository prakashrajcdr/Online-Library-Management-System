
INSERT INTO books(id, book_name, author) SELECT * FROM (SELECT 1 as id, 'Book-A' as book_name, 'Author-A' as author) AS BOOK WHERE NOT EXISTS (SELECT id FROM books where id = 1);
INSERT INTO books(id, book_name, author) SELECT * FROM (SELECT 2 as id, 'Book-B' as book_name, 'Author-B' as author) AS BOOK WHERE NOT EXISTS (SELECT id FROM books where id = 2);

INSERT INTO book_detail(id, page_no, page_detail, book_id) SELECT * FROM (SELECT 1 as id, 1 as page_no, 'Welcome to Introduction of Book-A...' as page_detail, 1 as book_id) AS BOOK_DETAIL WHERE NOT EXISTS (SELECT id FROM book_detail where id = 1);
INSERT INTO book_detail(id, page_no, page_detail, book_id) SELECT * FROM (SELECT 2 as id, 2 as page_no, 'This Page going to share of Book-A...' as page_detail, 1) AS BOOK_DETAIL WHERE NOT EXISTS (SELECT id FROM book_detail where id = 2);

INSERT INTO book_detail(id, page_no, page_detail, book_id) SELECT * FROM (SELECT 3 as id, 1 as page_no, 'Welcome to Introduction of Book-B' as page_detail, 2 as book_id) AS BOOK_DETAIL WHERE NOT EXISTS (SELECT id FROM book_detail where id = 3);
INSERT INTO book_detail(id, page_no, page_detail, book_id) SELECT * FROM (SELECT 4 as id, 2 as page_no, 'This Page going to share of Book-B...' as page_detail, 2 as book_id) AS BOOK_DETAIL WHERE NOT EXISTS (SELECT id FROM book_detail where id = 4);
INSERT INTO book_detail(id, page_no, page_detail, book_id) SELECT * FROM (SELECT 5 as id, 3 as page_no, 'This Page contains data of Book-B...' as page_detail, 2 as book_id) AS BOOK_DETAIL WHERE NOT EXISTS (SELECT id FROM book_detail where id = 5);
