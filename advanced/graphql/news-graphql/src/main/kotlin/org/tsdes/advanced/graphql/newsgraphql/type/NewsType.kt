package org.tsdes.advanced.graphql.newsgraphql.type

import java.time.ZonedDateTime


open class NewsType(
        authorId: String? = null,
        text: String? = null,
        country: String? = null,
        creationTime: ZonedDateTime? = null,
        var newsId: String? = null
) : InputUpdateNewsType(authorId, text, country, creationTime)