-- Passwords are in the format: Password<UserLetter>123. Unless specified otherwise.
-- Encrypted using https://www.javainuse.com/onlineBcrypt
INSERT INTO local_user (email, first_name, last_name, password, username, email_verified)
       VALUES ('UserA@junit.com', 'UserA-FirstName', 'UserA-LastName', '$2a$10$7.mICpY2/gl68uMfZpBhueBjZp9Xkomu27ydjmEYHr3hphB78aYsy', 'UserA', true)
       , ('UserB@junit.com', 'UserB-FirstName', 'UserB-LastName', '$2a$10$Sz50/gj7ZyW.dZEYWzajXuW1Se.9Tf023A/yEvp8cRiCgpuacw4b2', 'UserB', false);