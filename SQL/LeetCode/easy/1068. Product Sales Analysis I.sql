-- Product 테이블 생성
CREATE TABLE Product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50)
);

-- Sales 테이블 생성
CREATE TABLE Sales (
    sale_id INT,
    product_id INT,
    year INT,
    quantity INT,
    price INT,
    PRIMARY KEY (sale_id, year),
    FOREIGN KEY (product_id) REFERENCES Product(product_id)
);

-- Product 데이터 삽입
INSERT INTO Product (product_id, product_name) VALUES
(100, 'Nokia'),
(200, 'Apple'),
(300, 'Samsung');

-- Sales 데이터 삽입
INSERT INTO Sales (sale_id, product_id, year, quantity, price) VALUES
(1, 100, 2008, 10, 5000),
(2, 100, 2009, 12, 5000),
(7, 200, 2011, 15, 9000);

SELECT p.product_name, s.year, s.price
FROM Sales s
LEFT JOIN Product p
ON p.product_id = s.product_id