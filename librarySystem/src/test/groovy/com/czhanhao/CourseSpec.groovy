package com.czhanhao

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        

    when:"A Course has title"

   def coursetitle=new Course(title:'BSc Hon Engineering' )

   then:"the toString method will merge them."

   coursetitle.toString()=='BSc Hon Engineering'
    }
}
