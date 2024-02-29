CREATE TABLE quest
(
    id               BIGINT AUTO_INCREMENT PRIMARY KEY,
    quest_tag        ENUM('daily', 'weekly','event') NOT NULL COMMENT '퀘스트 테그',
    name             VARCHAR(255)                        NOT NULL,
    execution_status BOOLEAN,
    deleted          BOOLEAN                             NOT NULL,
    profile_id       BIGINT,
    created_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '생성 시간',
    updated_at       TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '수정 시간',
    FOREIGN KEY (profile_id) REFERENCES profile (id)
);