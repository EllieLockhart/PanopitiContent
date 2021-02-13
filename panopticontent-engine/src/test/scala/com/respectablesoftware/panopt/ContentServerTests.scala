package com.respectablesoftware.panopt

import org.scalatra.test.scalatest._

class ContentServerTests extends ScalatraFunSuite {

  addServlet(classOf[ContentServer], "/*")

  test("GET / on ContentServer should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
