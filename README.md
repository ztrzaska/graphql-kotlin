# GraphQL with kotlin and spring boot project

### Getting Started

The following application illustrate simple functionalities with graphQL API and kotlin. It has queries and mutations. To reduce development time, automatic graphql schema generation was used.

Graphql server was integrated with com.expediagroup libraries, which are dedicated for kotlin.

The application contains two projects:


* graphql-kotlin - graphql server
* graphql-kotlin-client - graphql client which connects to the graphql server


### Playground
```
http://localhost:9001/playground
```

### Example queries

```
query {
  getPeople {
    __typename,
    name,
    ... on Author {
      age
    },
    ... on Programmer {
      language
    }
  },
  getComputations {
    type,
    getResult
  },
  getUnion {
    __typename
  }
}
```


## Documentation of used libraries
* [GraphQL documentation](https://graphql.org/)
* [GraphQL Extended scalars documentation](https://github.com/graphql-java/graphql-java-extended-scalars)
* [Spring boot](https://docs.spring.io/spring-boot/docs/current/reference/html/)

