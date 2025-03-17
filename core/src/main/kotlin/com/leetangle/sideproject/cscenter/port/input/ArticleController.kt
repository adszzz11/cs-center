package com.leetangle.sideproject.cscenter.port.input

import com.leetangle.sideproject.cscenter.framework.input.adapter.ArticleQueryInputAdapter
import com.leetangle.sideproject.cscenter.framework.input.adapter.dto.ArticleOutput
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ArticleController(
    private val outputPort: ArticleQueryInputAdapter,
) {
    @GetMapping("/article")
    fun getArticleDesc(): ResponseEntity<List<ArticleOutput>> = ResponseEntity.ok(outputPort.getArticleDesc())

    @GetMapping("/article/{articleId}")
    fun getArticleDetail(
        @PathVariable articleId: Long,
    ): ResponseEntity<ArticleOutput> = ResponseEntity.ok(outputPort.getArticleDetail(articleId))
}
