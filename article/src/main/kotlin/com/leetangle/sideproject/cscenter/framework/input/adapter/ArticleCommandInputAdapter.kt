package com.leetangle.sideproject.cscenter.framework.input.adapter

import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleCreateInput
import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleDeleteInput
import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleUpdateInput

interface ArticleCommandInputAdapter {
    fun register(input: ArticleCreateInput)

    fun unregister(input: ArticleDeleteInput)

    fun update(input: ArticleUpdateInput)
}
