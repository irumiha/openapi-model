package net.liftio
package openapi

case class License(
  name: String,
  identifier: Option[String] = None,
  url: Option[String] = None
)
