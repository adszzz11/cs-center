package com.leetangle.sideproject.cscenter.infrastructure.jpa

import jakarta.persistence.*

@Entity
@Table(name = "$1")
class AdminEntity(
    val id: String,
    var pwd: String,
    var userName: String? = null,
    var dept: String? = null,
    var retryCnt: Int = 0,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val adminSq: Long = 0
}
