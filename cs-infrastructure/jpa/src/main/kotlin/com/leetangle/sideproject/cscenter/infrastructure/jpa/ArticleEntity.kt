package com.leetangle.sideproject.cscenter.infrastructure.jpa

import jakarta.persistence.*

@Entity
class ArticleEntity(
    var articleTitle: String,
    @Lob
    var articleContent: String? = null,
    val articleAuthor: String,
    val articleId: String,
    val articlePwd: String,
    val articleAuthorEmail: String? = null,
    val articleAuthorPhone: String? = null,
    var articleStatusCd: String = "PRE",
    var articleResolveContent: String? = null,
    @OneToMany(targetEntity = TagEntity::class, fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "tagSq")
    var articleTags: List<TagEntity> = mutableListOf(),
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val articleSq: Long = 0
}
