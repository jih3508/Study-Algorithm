-- 이미 있으면 지우고 새로 만든다 (여러 번 실행해도 같은 상태에서 시작하도록)
DROP TABLE IF EXISTS Salary;

CREATE TABLE Salary (
    id     INT PRIMARY KEY,
    name   VARCHAR(100),
    sex    ENUM('m', 'f'),
    salary INT
);

INSERT INTO Salary (id, name, sex, salary) VALUES
    (1, 'A', 'm', 2500),
    (2, 'B', 'f', 1500),
    (3, 'C', 'm', 5500),
    (4, 'D', 'f', 500);


UPDATE Salary
SET
    sex = IF(sex = 'm', 'f', 'm');

SELECT *
FROM  Salary;

