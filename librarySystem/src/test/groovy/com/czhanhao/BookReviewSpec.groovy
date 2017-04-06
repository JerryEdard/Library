package com.czhanhao

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BookReview)
class BookReviewSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        

    when:"A BookReview has book"

   def BookReviewbook=new BookReview(book:'BookX' )

   then:"the toString method will merge them."

   BookReviewbook.toString()=='BookX'
    }
}
