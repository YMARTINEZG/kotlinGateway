package us.learning.kotlinGateway.dto

import java.math.BigDecimal
import java.util.*

class TransactionDTO(
        val transactionId: Int,
        val accountId: Int,
        val linkedtoTransactionId: Int,
        val transactionDate: Date,
        val TransactionAmount: BigDecimal
)