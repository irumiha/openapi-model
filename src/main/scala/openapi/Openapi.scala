package net.liftio
package openapi

case class Openapi (
  openapi: String,
  info: Info,
  servers: List[Server],
  jsonSchemaDialect: Option[String],
  paths: Map[String, PathItem],
  components: Option[Components] = None,
  security: List[SecurityRequirement] = Nil,
  tags: List[Tag] = Nil,
  externalDocs: Option[ExternalDocumentation] = None
)
