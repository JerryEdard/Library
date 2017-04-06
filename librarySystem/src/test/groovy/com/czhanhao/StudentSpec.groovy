package com.czhanhao

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

   void toString() {
       

    when:"A Student has name"

   def janet=new Student(name:'Janet Taylor' )

   then:"the toString method will merge them."

   janet.toString()=='Janet Taylor'
    }
}
