package net.liftio
package openapi

case class MediaType (
  schema: Option[Schema] = None,
  example: Option[Json] = None,
  examples: Map[String, Example] = Map.empty,
  encoding: Map[String, Encoding] = Map.empty,
  extensions: Map[String, Any] = Map.empty,
)
