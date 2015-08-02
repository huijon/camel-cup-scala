package com.jono.app

import com.jono.app.game.{Camel, Board}
import org.scalatra._
import scalate.ScalateSupport

class CamelCupServlet extends CamelCupStack {

  get("/") {
    <html>
      <body>
        <h1>hi</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
