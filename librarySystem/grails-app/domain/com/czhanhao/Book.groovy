package com.czhanhao

class Book {

String title 

String subject

String author

String isbn

Date dateBorrowed

Date returnDate 

Student student

Boolean overdue

Library library

static hasMany=[bookReviews:BookReview]

String toString(){
 return title;
}

    static constraints = {

title blank:false, nullable:false

subject blank:false, nullable:false 

author blank:false, nullable:false 

isbn blank:false, nullable:false

dateBorrowed blank:false, nullable:false

returnDate blank:false, nullable:false

student blank:false, nullable:false

overdue blank:false, nullable:false




    }
}
