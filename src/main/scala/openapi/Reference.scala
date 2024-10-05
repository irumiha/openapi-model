package net.liftio
package openapi

case class Reference(
  `$ref`: String,
  summary: Option[String] = None,
  description: Option[String] = None
)
