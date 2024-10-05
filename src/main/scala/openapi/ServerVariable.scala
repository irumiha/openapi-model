package net.liftio
package openapi

case class ServerVariable(
  `enum`: List[String],
  default: String,
  description: Option[String] = None
)
