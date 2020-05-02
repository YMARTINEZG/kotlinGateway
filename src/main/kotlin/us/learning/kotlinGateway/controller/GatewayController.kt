package us.learning.kotlinGateway.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import us.learning.kotlinGateway.Config.AppConfig.Companion.topicProcess
import us.learning.kotlinGateway.dto.MoneyLaundryDTO
import us.learning.kotlinGateway.jsonMapper
import java.util.*

@RestController
@RequestMapping("/api")
class GatewayController(val kafkaTemplate: KafkaTemplate<String, String>) {

    @PostMapping("/create/profile")
    fun createBlackListProfile(@RequestBody dto: MoneyLaundryDTO) : ResponseEntity<MoneyLaundryDTO> {
        dto.eventId = UUID.randomUUID().toString()
        val newCustomerJson = jsonMapper.writeValueAsString(dto)
        logger.debug("JSON data: $newCustomerJson")

        kafkaTemplate.send(topicProcess,newCustomerJson )
        return ResponseEntity.ok(dto)
    }
    companion object {
        private val logger = LoggerFactory.getLogger(GatewayController::class.java)
    }
}