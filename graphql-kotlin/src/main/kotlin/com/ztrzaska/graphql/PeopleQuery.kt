package com.ztrzaska.graphql

import com.expediagroup.graphql.server.operations.Query
import com.ztrzaska.graphql.model.*
import graphql.schema.DataFetchingEnvironment
import org.springframework.stereotype.Component

@Component
class PeopleQuery : Query {

    fun getPeople() = listOf(
        Programmer(name = "Marek Nowak", language = listOf("Java", "Kotlin")),
        Author(name = "J.K. Rowning", AuthorType.GOOD)
    )

    fun getComputations() = Computations(type = "Add")

    fun getUnion(dfe: DataFetchingEnvironment) : Example {
        println(dfe.executionStepInfo.field)
        return ExampleName("sf")
    }
}