package com.czhanhao

class Library {

String nameOfBuilding 

String address

int openingHours

String location

String studySpaces

static hasMany=[librarians:Librarian,books:Book,students:Student]

String toString(){
 return location;
}

    static constraints = {

nameOfBuilding blank:false, nullable:false

address blank:false, nullable:false

openingHours blank:false, nullable:false, min:0, max:24

location blank:false, nullable:false

studySpaces blank:false, nullable:false



    }
}
