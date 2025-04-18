INSERT INTO system__service_action (service_action_id, service_action_type_id, parent_id, category_ko, category_en, content_en, content_ko)VALUES
    -- 발생 구분
     (322, 5, null, '발생 구분', 'OCCURRENCE CLASSIFICATION', 'R&D', 'R&D')
    ,(323, 5, null, '발생 구분', 'OCCURRENCE CLASSIFICATION', 'Production', '생산')
    ,(324, 5, null, '발생 구분', 'OCCURRENCE CLASSIFICATION', 'SET UP', 'SET UP')
    ,(325, 5, null, '발생 구분', 'OCCURRENCE CLASSIFICATION', 'SET UP', 'SET UP')
    -- 고객 site
    ,(326, 5, null, '고객 site', 'Client Site', 'Samsung''s Pyeongtaek' , '삼성 평택')
    -- 발생 유형
    ,(327, 5, null, '발생 유형', 'OCCURRENCE TYPE', 'improvement' , '개선')
    ,(328, 5, null, '발생 유형', 'OCCURRENCE TYPE', 'Client' , '고객')
    ,(329, 5, null, '발생 유형', 'OCCURRENCE TYPE', 'issue' , '이슈')
    -- 공정명
    ,(330, 5, null, '공정명', 'PROCESS NAME', 'Flatform' , 'Flatform')
    ,(331, 5, null, '공정명', 'PROCESS NAME', 'Sub Component' , 'Sub Component')
    ,(332, 5, null, '공정명', 'PROCESS NAME', 'System' , 'System')
    ,(333, 5, null, '공정명', 'PROCESS NAME', 'Ti' , 'Ti')
    ,(334, 5, null, '공정명', 'PROCESS NAME', 'Ti/TiN' , 'Ti/TiN')
    ,(335, 5, null, '공정명', 'PROCESS NAME', 'TiN' , 'TiN')
    -- PJT No.
    ,(336, 5, null, 'PJT No.', 'PJT No.', 'R2-692001' , 'R2-692001')
    ,(337, 5, null, 'PJT No.', 'PJT No.', 'R1-691603' , 'R1-691603')
    ,(338, 5, null, 'PJT No.', 'PJT No.', 'R1-692006' , 'R1-692006')
    ,(339, 5, null, 'PJT No.', 'PJT No.', 'IV/698-20-052' , 'IV/698-20-052')
    ,(340, 5, null, 'PJT No.', 'PJT No.', 'IV/ 39-21-015' , 'IV/ 39-21-015')
    ,(341, 5, null, 'PJT No.', 'PJT No.', 'IV/ 39-21-034' , 'IV/ 39-21-034')
    ,(342, 5, null, 'PJT No.', 'PJT No.', 'IV/39-21-035' , 'IV/39-21-035')
    -- Module
    ,(343, 5, null, 'Module', 'Module', 'PM' , 'PM')
    ,(344, 5, null, 'Module', 'Module', 'XX' , 'XX')
    ,(345, 5, null, 'Module', 'Module', 'EFEM' , 'EFEM')
    ,(346, 5, null, 'Module', 'Module', 'TM' , 'TM')
    ,(347, 5, null, 'Module', 'Module', 'L/L' , 'L/L')
    ,(348, 5, null, 'Module', 'Module', 'System' , 'System')
    -- 이슈 유형
    ,(349, 5, null, '이슈 유형', 'ISSUE TYPE', null , '표준류 불량')
    ,(350, 5, null, '이슈 유형', 'ISSUE TYPE', null , '외관 불량')
    ,(351, 5, null, '이슈 유형', 'ISSUE TYPE', null , '용접 불량')
    ,(352, 5, null, '이슈 유형', 'ISSUE TYPE', null , '차수 불량')
    ,(353, 5, null, '이슈 유형', 'ISSUE TYPE', null , '기능 불량')
    ,(354, 5, null, '이슈 유형', 'ISSUE TYPE', null , 'Leak')
    ,(355, 5, null, '이슈 유형', 'ISSUE TYPE', null , '자재 불량')
    ,(356, 5, null, '이슈 유형', 'ISSUE TYPE', null , 'S/W 불량')
    ,(357, 5, null, '이슈 유형', 'ISSUE TYPE', null , '장비 파손')
    -- 불량 유형
    ,(358, 5, null, '불량 유형', 'DEFECT TYPE', null , '차수불량')
    ,(359, 5, null, '불량 유형', 'DEFECT TYPE', null , '외관불량')
    ,(360, 5, null, '불량 유형', 'DEFECT TYPE', null , '용접불량')
    ,(361, 5, null, '불량 유형', 'DEFECT TYPE', null , '후처리불량')
    ,(362, 5, null, '불량 유형', 'DEFECT TYPE', null , '조립불량')
    ,(363, 5, null, '불량 유형', 'DEFECT TYPE', null , '기능불량')
    ,(364, 5, null, '불량 유형', 'DEFECT TYPE', null , '기능불량')
    ,(365, 5, null, '불량 유형', 'DEFECT TYPE', null , '납품불량')
    ,(366, 5, null, '불량 유형', 'DEFECT TYPE', null , '표준류불량')
    ,(367, 5, null, '불량 유형', 'DEFECT TYPE', null , 'Test 미진행')
    ,(368, 5, null, '불량 유형', 'DEFECT TYPE', null , 'SOP 불량')
    ,(369, 5, null, '불량 유형', 'DEFECT TYPE', null , '도면 불량')
    -- 불량 원인
    ,(370, 5, null, '불량 원인', 'DEFECT CAUSE', null , '가공불량')
    ,(371, 5, null, '불량 원인', 'DEFECT CAUSE', null , '작업불량')
    ,(372, 5, null, '불량 원인', 'DEFECT CAUSE', null , '도면오독')
    ,(373, 5, null, '불량 원인', 'DEFECT CAUSE', null , '관리미흡')
    ,(374, 5, null, '불량 원인', 'DEFECT CAUSE', null , '취급부주의')
    ,(375, 5, null, '불량 원인', 'DEFECT CAUSE', null , '새장불량')
    ,(376, 5, null, '불량 원인', 'DEFECT CAUSE', null , '원소재불량')
    ,(377, 5, null, '불량 원인', 'DEFECT CAUSE', null , '기구설계불량')
    ,(378, 5, null, '불량 원인', 'DEFECT CAUSE', null , '제어설계불량')
    ,(379, 5, null, '불량 원인', 'DEFECT CAUSE', null , '소프트웨어설계불량')
    ,(380, 5, null, '불량 원인', 'DEFECT CAUSE', null , '테스트불량')
    ,(381, 5, null, '불량 원인', 'DEFECT CAUSE', null , '포장불량')
    ,(382, 5, null, '불량 원인', 'DEFECT CAUSE', null , '설비불량')
    ,(383, 5, null, '불량 원인', 'DEFECT CAUSE', null , '표면처리불량')
    ,(384, 5, null, '불량 원인', 'DEFECT CAUSE', null , '원인불명')
    -- 설비 코드(equipment_code)
    ,(385, 5, null, '설비 코드', 'EQUIPMENT CODE', 'SHBD701', 'SHBD701');