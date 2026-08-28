CREATE TABLE Products (
    product_id INT PRIMARY KEY,
    store1 INT,
    store2 INT,
    store3 INT
);

INSERT INTO Products (product_id, store1, store2, store3) VALUES
(0, 95, 100, 105),
(1, 70, NULL, 80);


SELECT
    product_id
    ,'store1' AS store
    ,store1 AS price
FROM Products
WHERE store1 IS NOT NULL

UNION ALL

SELECT
    product_id
    ,'store2' AS store
    ,store2 AS price
FROM Products
WHERE store2 IS NOT NULL

UNION ALL

SELECT
    product_id
    ,'store3' AS store
    ,store3 AS price
FROM Products
WHERE store3 IS NOT NULL;


DROP TABLE Products;