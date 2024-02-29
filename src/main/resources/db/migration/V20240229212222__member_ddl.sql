CREATE TABLE member
(
    id         BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_id VARCHAR(255)                        NOT NULL COMMENT '계정 id',
    password   VARCHAR(255) COMMENT '페스워드',
    type       ENUM('default', 'kakao') NOT NULL COMMENT '계정 타입',
    deleted    BOOLEAN                             NOT NULL COMMENT '삭제 여부',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '생성 시간',
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '수정 시간'
);