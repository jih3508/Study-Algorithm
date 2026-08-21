CREATE TABLE Employees (
    emp_id INT,
    event_day DATE,
    in_time INT,
    out_time INT,
    PRIMARY KEY (emp_id, event_day, in_time)
);

INSERT INTO Employees (emp_id, event_day, in_time, out_time) VALUES
(1, '2020-11-28', 4, 32),
(1, '2020-11-28', 55, 200),
(1, '2020-12-03', 1, 42),
(2, '2020-11-28', 3, 33),
(2, '2020-12-09', 47, 74);

SELECT
    event_day AS day
    ,emp_id
    ,SUM(out_time - in_time) AS total_time
FROM Employees
GROUP BY event_day, emp_id;

DROP TABLE Employees;