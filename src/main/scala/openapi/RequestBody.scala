package net.liftio
package openapi

case class RequestBody(
  description: Option[String],
  content: Map[String, MediaType],
  required: Boolean = false
)
