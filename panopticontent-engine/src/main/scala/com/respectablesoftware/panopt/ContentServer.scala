package com.respectablesoftware.panopt

import org.scalatra._

class ContentServer extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
