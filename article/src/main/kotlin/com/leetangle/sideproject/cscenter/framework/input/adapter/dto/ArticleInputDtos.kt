package com.leetangle.sideproject.cscenter.framework.input.adapter.dto

data class ArticleCreateInput(
    val title: String,
    val content: String,
    val authorName: String,
    val authorId: String,
    val authorPwd: String,
    val authorEmail: String,
    val authorPhone: String,
)

data class ArticleDeleteInput(
    val articleId: Long,
    val authorId: String,
    val authorPwd: String,
)

data class ArticleUpdateInput(
    val articleId: Long,
    val authorId: String,
    val authorPwd: String,
    val updateContent: String? = null,
    val updateAuthorName: String? = null,
    val updateAuthorEmail: String? = null,
    val updateAuthorPhone: String? = null,
)
