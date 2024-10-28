-- Insert roles into the authorities table
INSERT INTO authorities(authority)
VALUES ('ROLE_USER');
INSERT INTO authorities(authority)
VALUES ('ROLE_ADMIN');
INSERT INTO authorities(authority)
VALUES ('ROLE_DEVELOPER');

-- Insert users into the users table
INSERT INTO users(username, password, account_non_expired, account_non_locked, credentials_non_expired, enabled)
VALUES ('Developer', '$2a$10$M4UraNDuEy/gsKprhNu4SuwdSuWYV/.Rs90yLBU1.3D863inqyBmK', true, true, true, true);
INSERT INTO users(username, password, account_non_expired, account_non_locked, credentials_non_expired, enabled)
VALUES ('Admin', '$2a$10$f.OJdagkXMgQMWtUxoyCwe6r4kTlLW3NRKRJPmD9RGCpl5GGYaroK', true, true, true, true);
INSERT INTO users(username, password, account_non_expired, account_non_locked, credentials_non_expired, enabled)
VALUES ('User', '$2a$10$1wedEWL7xa1gkNYPckeDGOX.2jnsFt2Pt8dAjFujEufwlWdkvhh/S', true, true, true, true);

-- Insert user-authority mappings
INSERT INTO users_authorities(users_id, authorities_id)
VALUES (1, 1);
INSERT INTO users_authorities(users_id, authorities_id)
VALUES (1, 2);
INSERT INTO users_authorities(users_id, authorities_id)
VALUES (1, 3);
INSERT INTO users_authorities(users_id, authorities_id)
VALUES (2, 1);
INSERT INTO users_authorities(users_id, authorities_id)
VALUES (2, 2);
INSERT INTO users_authorities(users_id, authorities_id)
VALUES (3, 1);
