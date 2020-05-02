package us.learning.kotlinGateway.dto

import java.math.BigDecimal

class AccountDTO(
  val accountId: Int,
  val accountType: String,
  val balance: BigDecimal
)