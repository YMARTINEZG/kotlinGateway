package us.learning.kotlinGateway.dto

class OrganizationDTO(
  val organizationName: String,
  val associate: List<AssociateDTO>? = null,
  val associationType: String? = null,
  val organizationDetail: String? = null
)