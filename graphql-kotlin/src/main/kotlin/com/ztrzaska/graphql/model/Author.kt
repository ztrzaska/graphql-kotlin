package com.ztrzaska.graphql.model

data class Author(override var name: String, var age: AuthorType) : People