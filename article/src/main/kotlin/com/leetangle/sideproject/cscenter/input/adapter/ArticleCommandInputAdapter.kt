package com.leetangle.sideproject.cscenter.input.adapter

import com.leetangle.sideproject.cscenter.input.adapter.dto.ArticleCreateInput
import com.leetangle.sideproject.cscenter.input.adapter.dto.ArticleDeleteInput
import com.leetangle.sideproject.cscenter.input.adapter.dto.ArticleUpdateInput

interface ArticleCommandInputAdapter {
    fun register(input: ArticleCreateInput)

    fun unregister(input: ArticleDeleteInput)

    fun update(input: ArticleUpdateInput)
}
