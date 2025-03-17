package com.leetangle.sideproject.cscenter.framework.input.adapter

import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleOutput
import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleSearchCondition
import java.awt.print.Pageable

interface ArticleQueryInputAdapter {
    fun getArticleDetail(articleId: Long): ArticleOutput

    fun getArticleDesc(
        pageable: Pageable? = null,
        searchCondition: ArticleSearchCondition? = null,
    ): List<ArticleOutput>
}
