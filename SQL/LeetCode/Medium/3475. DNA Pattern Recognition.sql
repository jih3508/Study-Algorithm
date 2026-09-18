-- 테이블 생성
DROP TABLE IF EXISTS Samples;

CREATE TABLE Samples (
    sample_id     INT PRIMARY KEY,
    dna_sequence  VARCHAR(255),
    species       VARCHAR(100)
);

-- 데이터 삽입
INSERT INTO Samples (sample_id, dna_sequence, species) VALUES
(1, 'ATGCTAGCTAGCTAA', 'Human'),
(2, 'GGGTCAATCATC',    'Human'),
(3, 'ATATATCGTAGCTA',  'Human'),
(4, 'ATGGGGTCATCATAA', 'Mouse'),
(5, 'TCAGTCAGTCAG',    'Mouse'),
(6, 'ATATCGCGCTAG',    'Zebrafish'),
(7, 'CGTATGCGTCGTA',   'Zebrafish');


select * FROM Samples;

SELECT sample_id
    ,dna_sequence
    ,species
    ,dna_sequence LIKE 'ATG%' AS has_start
    ,RIGHT(dna_sequence, 3) IN ('TAA', 'TAG', 'TGA') AS has_stop
    ,dna_sequence LIKE  '%ATAT%' AS has_atat
    ,dna_sequence LIKE '%GGG%' AS has_ggg
FROM Samples
ORDER BY sample_id;

DROP TABLE Samples;