package controllers

import javax.inject.Inject

import play.api.mvc._
import play.api.libs.functional.syntax._

import views._
import models.{ PageService, SitePrefs }

class Pages @Inject() (pageService: PageService) extends Controller {

  def index() =
    Action { implicit request =>
    Ok(html.index(request.domain + request.uri, SitePrefs.name, SitePrefs.description, SitePrefs.keywords))
  }

  def display(path: String) = Action { implicit request =>
    pageService.findBySlug(path).map { page =>
      Ok(html.pages.single(request.domain + request.uri, page))
    }.getOrElse(NotFound("Four-Oh-Four!"))
  }

}
