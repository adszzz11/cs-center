package com.leetangle.sideproject.cscenter.input.adapter

import com.leetangle.sideproject.cscenter.input.adapter.dto.ArticleOutput
import com.leetangle.sideproject.cscenter.input.adapter.dto.ArticleSearchCondition
import java.awt.print.Pageable

interface ArticleQueryInputAdapter {
    fun getArticleDetail(articleId: Long): ArticleOutput

    fun getArticleDesc(
        pageable: Pageable,
        searchCondition: ArticleSearchCondition,
    ): List<ArticleOutput>
}
