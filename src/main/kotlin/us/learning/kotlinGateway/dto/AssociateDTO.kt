package us.learning.kotlinGateway.dto

class AssociateDTO(
        val organization : OrganizationDTO,
        val associatetoOrganization: CustomerDTO,
        val asscociationType: String
)