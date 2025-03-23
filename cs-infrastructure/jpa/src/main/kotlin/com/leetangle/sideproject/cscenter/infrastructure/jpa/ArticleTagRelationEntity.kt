package com.leetangle.sideproject.cscenter.infrastructure.jpa

import jakarta.persistence.*

@Entity
@Table(name = "$1")
class ArticleTagRelationEntity(
    @Id
    @ManyToOne
    @JoinColumn(name = "articleSq")
    val article: ArticleEntity,
    @Id
    @ManyToOne
    @JoinColumn(name = "tagSq")
    val tag: TagEntity,
)
