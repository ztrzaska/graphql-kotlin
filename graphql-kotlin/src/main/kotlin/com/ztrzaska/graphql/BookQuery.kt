package com.ztrzaska.graphql;

import com.expediagroup.graphql.server.operations.Query
import com.ztrzaska.graphql.model.Book
import org.springframework.stereotype.Component

@Component
class BookQuery : Query {

    @Deprecated("Do not use this")
    fun getBook() = Book("Harry Potter")

}