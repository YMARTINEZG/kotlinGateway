package us.learning.kotlinGateway.dto

import javax.validation.constraints.NotEmpty

class MoneyLaundryDTO (
        var eventId: String?=null,
        @field:NotEmpty
        val customer: CustomerDTO,
        val organization: OrganizationDTO? = null,
        @field:NotEmpty
        val accounts: List<AccountDTO>,
        val transactions: List<TransactionDTO>? = null
)