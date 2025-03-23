package com.leetangle.sideproject.cscenter.application.service

import com.leetangle.sideproject.cscenter.framework.input.adapter.ArticleQueryInputAdapter
import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleOutput
import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleSearchCondition
import java.awt.print.Pageable

// @Service
class ArticleQueryService : ArticleQueryInputAdapter {
    override fun getArticleDetail(articleId: Long): ArticleOutput =
        ArticleOutput(
            articleId = 0,
            title = "TODO()",
            content = "TODO()",
            authorName = "TODO()",
        )

    override fun getArticleDesc(
        pageable: Pageable?,
        searchCondition: ArticleSearchCondition?,
    ): List<ArticleOutput> =
        listOf(
            ArticleOutput(
                articleId = 0,
                title = "TODO()",
                content = "TODO()",
                authorName = "TODO()",
            ),
        )
}
