package net.liftio
package openapi

case class PathItem(
  `$ref`: Option[String] = None,
  summary: Option[String] = None,
  description: Option[String] = None,
  get: Option[OperationObject] = None,
  put: Option[OperationObject] = None,
  post: Option[OperationObject] = None,
  delete: Option[OperationObject] = None,
  options: Option[OperationObject] = None,
  head: Option[OperationObject] = None,
  patch: Option[OperationObject] = None,
  trace: Option[OperationObject] = None,
  servers: List[Server] = Nil,
  parameters: List[Parameter | Reference] = Nil
)
