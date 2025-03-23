package com.leetangle.sideproject.cscenter.infrastructure.jpa

import jakarta.persistence.*

@Entity
@Table(name = "$1")
class CommentEntity(
    @ManyToOne
    @JoinColumn(name = "articleSq")
    val article: ArticleEntity,
    val commentContent: String?,
    val masterCommentSq: Long?,
    val upperCommentSq: Long?,
    val commentLiked: Long?,
    val commentAuthorId: String?,
    val commentAuthorNickname: String?,
    val commentAuthorPwd: String?,
    val commentSecretYn: String?,
    val commentAdminYn: String?,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val commentSq: Long = 0
}
