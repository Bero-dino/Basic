INSERT INTO member (id, login_id, password, name, phone_number, used, created_by)
VALUES (1, 'admin001', '$2a$10$38DtP9K7WTrnFDiDlPCn7eZaDnvZwrscI9IrsVzt4goBorA0498MK', '관리자',
        '010-1111-1111', 'USED', 'system'), -- password 1234
       (2, 'user001', '$2a$10$38DtP9K7WTrnFDiDlPCn7eZaDnvZwrscI9IrsVzt4goBorA0498MK', '일반유저',
        '010-2222-2222', 'USED', 'system');

INSERT INTO role (id, name, used, created_by)
VALUES (1, 'ROLE_ADMIN', 'USED', 'system'),
       (2, 'ROLE_USER', 'USED', 'system');

INSERT INTO member_role (member_id, role_id)
VALUES (1, 1),
       (2, 2);
