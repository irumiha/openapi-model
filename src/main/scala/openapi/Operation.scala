package net.liftio
package openapi

case class Operation (
  tags: List[String] = Nil,
  summary: Option[String] = None,
  description: Option[String] = None,
  externalDocs: Option[ExternalDocumentation] = None,
  operationId: Option[String] = None,
  parameters: List[Parameter | Reference] = Nil,
  requestBody: Option[RequestBody | Reference] = None,
  responses: Map[String, Response | Reference] = Map.empty,
  callbacks: Map[String, Callback | Reference] = Map.empty,
  deprecated: Boolean = false,
  security: List[SecurityRequirement] = Nil,
  servers: List[Server] = Nil,
)
