package com.czhanhao

class BootStrap {

    def init = { servletContext ->


/*def Course1= new Course(title:'Software engineer',
code:'lecturer',
leader:'JerryEdard',
department:'computer',
description:''' this is the description in short''',
studyModle:'Modle1').save()

def Course2= new Course(title:'Web engineer',
code:'lecturer',
leader:'Tom',
department:'computer',
description:''' this is the description in short''',
studyModle:'Modle1').save()


def Student1= new Student(name:'zhang aijia',
email:'21479645@qq.com',
username:'jiajia',
password:'secret',
studentId:'b6032422',
course:Course1).save()


def Student2 = new Student(name:'A',
email:'asdfd@qq.com',
username:'ASF',
password:'123',
studentId:'b65335387',
course:Course1).save()


def Book1= new Book(title:'bookA',
subject:'computer',
author:'authorA',
isbn:'asdad',
dateBorrowed:new Date('10/11/1996'),
returnDate:new Date('12/11/2006'),
student:'anyStudent',
overdue:true).save()


def Book2= new Book(title:'bookB',
subject:'computer',
author:'authorB',
isbn:'asdadSS',
dateBorrowed:new Date('10/11/1997'),
returnDate:new Date('12/11/2007'),
student:'anyStudent',
overdue:true).save()


def Library1= new Library(nameOfBuilding:'Owen building',
address:'anywhere',
openingHours:24,
location:'sheffield',
studySpaces:'ground floor').save()


def Library2= new Library(nameOfBuilding:'Cantor building',
address:'anywhere',
openingHours:24,
location:'sheffield',
studySpaces:'ground floor').save()


def Librarian1= new Librarian(name:'steven rogen',
email:'anyemail@qq.com',
office:'9324',
username:'steven',
password:'secret1',
telephone:'7488748483',
library:'diamond').save()

def Librarian2= new Librarian(name:'rick rogen',
email:'anyemail@qq.com',
office:'9344',
username:'rick',
password:'secret2',
telephone:'7864338483',
library:'diamond').save()


def BookReview1= new BookReview(book:'anybook',
dateCreated:new Date('10/11/1996'),
student:'studentA',
review:'reviewA').save()


def BookReview2= new BookReview(book:'anybook2',
dateCreated:new Date('10/11/1997'),
student:'studentB',
review:'reviewB').save()


Student1.addToBooks(Book1)

Student1.addToBookReviews(BookReview1)

Book1.addToBookReviews(BookReview1)

Library1.addToBooks(Book1)

Library1.addToStudents(Student1)

Library1.addToLibrarians(Librarian1)

Student2.addToBooks(Book2)

Student2.addToBookReviews(BookReview2)

Book2.addToBookReviews(BookReview2)

Library2.addToBooks(Book2)

Library2.addToStudents(Student2)

Library2.addToLibrarians(Librarian2)*/


    }
    def destroy = {
    }
}
