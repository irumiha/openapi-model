package net.liftio
package openapi

case class Parameter (
  name: String,
  in: String,
  description: Option[String],
  required: Boolean = false,
  deprecated: Boolean = false,
  allowEmptyValue: Boolean = false
)
