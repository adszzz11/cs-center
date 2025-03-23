package com.leetangle.sideproject.cscenter.infrastructure.jpa

import jakarta.persistence.*

@Entity
@Table(name = "TAG")
class TagEntity(
    val tagName: String,
    val tagDesc: String? = null,
    val tagType: String,
    val tagCritical: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val tagSq: Long = 0
}
