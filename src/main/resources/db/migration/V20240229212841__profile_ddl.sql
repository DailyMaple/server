CREATE TABLE profile
(
    id                     BIGINT AUTO_INCREMENT PRIMARY KEY,
    profile_character_name VARCHAR(255)                        NOT NULL COMMENT '프로필 계정 닉네임',
    deleted                BOOLEAN                             NOT NULL COMMENT '삭제 여부',
    member_id              BIGINT COMMENT '멤버 id',
    created_at             TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '생성 시간',
    updated_at             TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '수정 시간',
    FOREIGN KEY (member_id) REFERENCES member (id)
);