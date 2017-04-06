package com.czhanhao

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

     void toString() {
       

    when:"A Librarian has name"

   def librarianName=new Librarian(name:'James Talor' )

   then:"the toString method will merge them."

   librarianName.toString()=='James Talor'
    }
}
