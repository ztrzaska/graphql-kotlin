package com.ztrzaska.graphql

import com.expediagroup.graphql.client.spring.GraphQLWebClient
import com.ztrzaska.graphql.generated.PeopleQuery

import kotlinx.coroutines.runBlocking


fun main(args: Array<String>) {

	runBlocking {
		var client = GraphQLWebClient(url = "http://localhost:9001/graphql")
		var peopleQuery = client.execute(PeopleQuery())

		println(peopleQuery.data)
	}
}
