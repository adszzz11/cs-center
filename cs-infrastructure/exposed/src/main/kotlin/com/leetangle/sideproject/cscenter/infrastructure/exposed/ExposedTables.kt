package com.leetangle.sideproject.cscenter.infrastructure.exposed

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

// TB_CS_TAG_M
object TbCsTagM : Table("TB_CS_TAG_M") {
    val tagSq: Column<Long> = long("TAG_SQ")
    val tagName: Column<String?> = varchar("TAG_NAME", 100).nullable()
    val tagDesc: Column<String?> = varchar("TAG_DESC", 500).nullable()
    val tagType: Column<String?> = varchar("TAG_TYPE", 100).nullable()
    val tagCritical: Column<String?> = varchar("TAG_CRITICAL", 20).nullable()

    override val primaryKey = PrimaryKey(tagSq)
}

// TB_CS_ADMIN_M
object TbCsAdminM : Table("TB_CS_ADMIN_M") {
    val adminSq: Column<Long> = long("ADMIN_SQ").autoIncrement()
    val id: Column<String?> = varchar("ID", 100).nullable()
    val pwd: Column<String?> = varchar("PWD", 100).nullable()
    val userName: Column<String?> = varchar("USER_NAME", 100).nullable()
    val dept: Column<String?> = varchar("DEPT", 100).nullable()
    val retryCnt: Column<Int?> = integer("RETRY_CNT").nullable()

    override val primaryKey: PrimaryKey = PrimaryKey(adminSq)
}

// TB_CS_ARTICLE_M
object TbCsArticleM : Table("TB_CS_ARTICLE_M") {
    val articleSq: Column<Long> = long("ARTICLE_SQ")
    val articleTitle: Column<String?> = varchar("ARTICLE_TITLE", 200).nullable()
    val articleContent = text("ARTICLE_CONTENT")
    val articleAuthor: Column<String?> = varchar("ARTICLE_AUTHOR", 100).nullable()
    val articleId: Column<String?> = varchar("ARTICLE_ID", 100).nullable()
    val articlePwd: Column<String?> = varchar("ARTICLE_PWD", 100).nullable()
    val articleAuthorEmail: Column<String?> = varchar("ARTICLE_AUTHOR_EMAIL", 200).nullable()
    val articleAuthorPhone: Column<String?> = varchar("ARTICLE_AUTHOR_PHONE", 100).nullable()
    val articleStatusCd: Column<String?> = varchar("ARTICLE_STATUS_CD", 20).nullable()
    val articleResolveContent: Column<String?> = varchar("ARTICLE_RESOLVE_CONTENT", 100).nullable()

    override val primaryKey = PrimaryKey(articleSq)
}

// TB_CS_ARTICLE_TAG_R
object TbCsArticleTagR : Table("TB_CS_ARTICLE_TAG_R") {
    val articleSq: Column<Long> = long("ARTICLE_SQ")
    val tagSq: Column<Long> = long("TAG_SQ")

    // 복합 PK
    override val primaryKey = PrimaryKey(articleSq, tagSq)
}

// TB_CS_COMMENT_M
object TbCsCommentM : Table("TB_CS_COMMENT_M") {
    val commentSq: Column<Long> = long("COMMENT_SQ")
    val articleSq: Column<Long> = long("ARTICLE_SQ")
    val commentContent: Column<String?> = varchar("COMMENT_CONTENT", 1000).nullable()
    val masterCommentSq: Column<Long?> = long("MASTER_COMMENT_SQ").nullable()
    val upperCommentSq: Column<Long?> = long("UPPER_COMMENT_SQ").nullable()
    val commentLiked: Column<Long?> = long("COMMENT_LIKED").nullable()
    val commentAuthorId: Column<String?> = varchar("COMMENT_AUTHOR_ID", 100).nullable()
    val commentAuthorNickname: Column<String?> = varchar("COMMENT_AUTHOR_NICKNAME", 100).nullable()
    val commentAuthorPwd: Column<String?> = varchar("COMMENT_AUTHOR_PWD", 100).nullable()
    val commentSecretYn: Column<String?> = varchar("COMMENT_SECRET_YN", 100).nullable()
    val commentAdminYn: Column<String?> = varchar("COMMENT_ADMIN_YN", 100).nullable()

    // 복합 PK
    override val primaryKey = PrimaryKey(commentSq)
}
