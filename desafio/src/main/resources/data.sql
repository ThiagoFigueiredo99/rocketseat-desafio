CREATE TABLE IF NOT EXISTS DESAFIO (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    active BOOLEAN NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);

INSERT INTO desafio (name, category, active, created_at, updated_at) VALUES 
('Curso de Java', 'Programação', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Curso de Spring Boot', 'Programação', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
('Curso de Python', 'Programação', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
