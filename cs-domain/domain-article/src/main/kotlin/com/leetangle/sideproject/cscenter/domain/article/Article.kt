package com.leetangle.sideproject.cscenter.domain.article

data class Article(
    val articleId: Long,
    val title: String,
    val author: Author,
    val content: String,
)

data class Author(
    val authorName: String,
    val authorId: String,
    val authorPwd: String,
    val authorEmail: String,
    val authorPhone: String,
)
