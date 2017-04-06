package com.czhanhao

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        

    when:"A Book has title"

   def Booktitle=new Book(title:'BookXT' )

   then:"the toString method will merge them."

   Booktitle.toString()=='BookXT'
    }
}
