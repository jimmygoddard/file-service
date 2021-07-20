package com.cogitocorp.service.file.dao.repository.entity

import com.cogitocorp.service.file.dto.File
import java.time.Instant
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.Table

@Entity
@Table(name = "file")
class FileEntity(
  val name: String,
  val size: Long,
  val timestamp: Instant,
  @Lob @Column(columnDefinition = "CLOB") val contents: ByteArray,
  @Id val id: UUID = UUID.randomUUID(),
) {
  constructor(file: File) : this(file.name, file.size, file.timestamp, file.contents)
}

