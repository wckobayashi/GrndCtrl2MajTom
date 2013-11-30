package models

import play.api.db._
import play.api.Play.current

object SitePrefs {
  val name: String = "Your New Site"
  val tagline: Option[String] = null
  val description = Some("Write a description of your site here to use as a default for pages that lack a description of their own")
  val keywords = Some("keywords")
}