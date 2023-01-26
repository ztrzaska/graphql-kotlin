package com.ztrzaska.graphql.model

data class Programmer(override var name: String, var language: List<String>) : People