-- create table IF NOT EXISTS Content (
--                                        id int IDENTITY(1, 1) primary key ,
--                                        title varchar(255) not null,
--                                        description text,
--                                        status varchar(20) not null,
--                                        content_type varchar(50) not null,
--                                        date_created timestamp not null,
--                                        date_updated timestamp,
--                                        url varchar(255),
-- );
CREATE TABLE Content (
                         id INT IDENTITY(1, 1) PRIMARY KEY,
                         title VARCHAR(255) NOT NULL,
                         description TEXT,
                         [status] VARCHAR(20) NOT NULL,
                         content_type VARCHAR(50) NOT NULL,
                         date_created DATETIME NOT NULL DEFAULT GETDATE(),
                         date_updated DATETIME,
                         url VARCHAR(255)
);


-- insert into Content(title,desc,status,content_type,date_created)
-- values ('My blog','a post from spring','IDEA','ARTICLE',CURRENT_TIMESTAMP);