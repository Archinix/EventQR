package com.thedavelopers.eventqr.features.organizer.model.dto

import java.time.Instant
import java.util.UUID

data class OrganizerTransactionRuleDto(
    val id: UUID? = null,
    val eventId: UUID,
    val scanPurposeId: UUID,
    val active: Boolean = true,
    val allowDuplicate: Boolean = false,
    val duplicateWindowMinutes: Int = 0,
    val maxUsesPerRegistration: Int = 1,
    val requiresStaffAssignment: Boolean = true,
    val pointsAwarded: Int = 0,
    val createdAt: Instant? = null,
    val updatedAt: Instant? = null,
)

data class TransactionRuleRequest(
    val scanPurposeId: UUID,
    val active: Boolean,
    val allowDuplicate: Boolean,
    val duplicateWindowMinutes: Int = 0,
    val maxUsesPerRegistration: Int = 1,
    val requiresStaffAssignment: Boolean,
    val pointsAwarded: Int,
)
