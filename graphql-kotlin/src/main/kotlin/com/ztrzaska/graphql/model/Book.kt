package com.ztrzaska.graphql.model

import com.expediagroup.graphql.generator.annotations.GraphQLDescription

@GraphQLDescription("This is a simple book")
data class Book(

    @GraphQLDescription("Name field")
    @Deprecated("No longer needed")
    val name: String
)