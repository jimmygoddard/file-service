package com.cogitocorp.service.file.dao.repository

import com.cogitocorp.service.file.dao.repository.entity.ViewedTimeEntity
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface ViewedTimeRepository : JpaRepository<ViewedTimeEntity, UUID> {
  fun findByOrderByViewedTimeDesc(pageable: Pageable): List<ViewedTimeEntity>
}
