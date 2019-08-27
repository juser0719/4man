CREATE TABLE costom_info
(
    `ID`       VARCHAR(45)    NOT NULL    COMMENT '아이디', 
    `PASS`     VARCHAR(45)    NULL        COMMENT '비밀번호', 
    `TEL`      VARCHAR(45)    NULL        COMMENT '번호', 
    `NAME`     VARCHAR(45)    NULL        COMMENT '이름', 
    `ADDRESS`  VARCHAR(45)    NULL        COMMENT '주소', 
    `ITEM`     INT            NULL        COMMENT '상품', 
    `LIST`    VARCHAR(45)    NULL        COMMENT '주문목록', 
    `PRICE`    INT            NULL        COMMENT '가격', 
    PRIMARY KEY (ID)
);

ALTER TABLE costom_info COMMENT '고객정보';


-- costom_info Table Create SQL
CREATE TABLE item
(
    `ITEM`   INT    NULL        COMMENT '상품이름', 
    `PRICE`  INT    NULL        COMMENT '가격', 
    `NUM`    INT    NULL        COMMENT '상품갯수'
);

ALTER TABLE item COMMENT '상품';


-- costom_info Table Create SQL
CREATE TABLE ordered
(
    `ITEM`   INT            NULL        COMMENT '상품', 
    `NUM`    INT            NULL        COMMENT '갯수', 
    `PRICE`  INT            NULL        COMMENT '가격', 
    `STATE`  VARCHAR(45)    NULL        COMMENT '주문현황', 
    PRIMARY KEY (ITEM)
);

ALTER TABLE ordered COMMENT '구매목록';


-- costom_info Table Create SQL
CREATE TABLE wish
(
    `ITEM`   INT    NOT NULL    COMMENT '상품', 
    `NUM`    INT    NULL        COMMENT '상품갯수', 
    `PRICE`  INT    NULL        COMMENT '가격', 
    PRIMARY KEY (ITEM)
);

ALTER TABLE wish COMMENT '장바구니';


