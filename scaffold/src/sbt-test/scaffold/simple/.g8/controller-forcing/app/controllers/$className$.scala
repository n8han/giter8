package controllers

import play.api._
import play.api.mvc._

object $className$ extends Controller {

  // In the scripted test this file should overwrite the existing controller file

  def index = Action {
    Ok(views.html.index("This application is awesome."))
  }

}
