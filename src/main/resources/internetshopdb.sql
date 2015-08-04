DROP DATABASE IF EXISTS internetshopdb;

CREATE DATABASE internetshopdb;

USE internetshopdb;



CREATE TABLE User
(
	idUser int PRIMARY KEY  NOT NULL AUTO_INCREMENT,
    
    userName VARCHAR(45),
    
    userSurName VARCHAR(45),
    
    userLogin VARCHAR(45),
    
    userPassword VARCHAR(45),
    
    userAddress VARCHAR(45),
    
    userPhoneNumber VARCHAR(45),
    
	userEmail VARCHAR(45),
    
    alreadybuy TINYINT(1) NULL DEFAULT 0,
    
    signedin TINYINT(1) NULL DEFAULT 0
	
);



CREATE TABLE Orders
(
	idOrders int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    
    dateOfOrder date,
    
    idUser int,
    
    totalPrice  DOUBLE,
    
    CONSTRAINT  FK_Orders_User FOREIGN KEY (idUser) REFERENCES User(idUser)  ON DELETE SET NULL ON UPDATE SET NULL
);




CREATE TABLE Article
(
	idArticle int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    
    articleName VARCHAR(45),
    
    articleQuantity int,
    
    articlePhotoPath VARCHAR(45),
    
	articlePrice DOUBLE
    
);


CREATE TABLE Article_Orders 
(
	idArticle_Orders int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    
    idArticle int,
    
    quantity INT(11) NULL DEFAULT 1,
    
    idOrders int,
    
    CONSTRAINT FK_Article_Orders_Article FOREIGN KEY (idArticle) REFERENCES Article(idArticle) ON DELETE SET NULL ON UPDATE SET NULL,
    
    CONSTRAINT FK_Article_Orders_Orders FOREIGN KEY (idOrders) REFERENCES Orders(idOrders) ON DELETE SET NULL ON UPDATE SET NULL
);



INSERT INTO User (idUser, userName, userSurName, userLogin, userPassword, userAddress, userPhoneNumber,UserEmail)
VALUES  (1, 'Ivan',      'Ivanov','login', 'password','address', '+380671111111', 'ivav@ukr.net'),
		(2, 'Ivan1',      'Ivanov1','login1', 'password1','address1', '+380671111112', 'ivav1@ukr.net');
      


INSERT INTO Article(idArticle, articleName, articleQuantity, articlePhotoPath) 
VALUES  (1,   'HDD',   10,       'default_path'),
		(2,    'CPU',   10,       'default_path');
        
INSERT INTO Orders(idOrders, dateOfOrder, idUser, totalPrice) 
VALUES  (1,   '2015-02-12',   1,     1000),
		(2,    '2015-01-11',   2,    2000);

