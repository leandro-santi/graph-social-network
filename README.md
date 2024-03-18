<div align="center">
  <img src="https://pennylane.ai/_images/graph4.png" width="230px" />
</div>
<div align="center">
  <img src="https://img.shields.io/github/languages/count/leandro-santi/graph-social-network?color=%231E90FF&style=flat-square" alt="languages" />
  <img src="https://img.shields.io/github/license/leandro-santi/graph-social-network?color=%231E90FF&style=flat-square" alt="license" />
  <img src="https://img.shields.io/github/repo-size/leandro-santi/graph-social-network?color=%231E90FF&style=flat-square" alt="repo size" />
</div>

# Anteiku

This project is an implementation of a [Social Network Graph](https://www.ibm.com/docs/en/iii/10.0.0?topic=tool-social-network-graph) using graph theory.

## About

Anteiku is a console-based prototype of a social network to demonstrate how it works.

-  There's a strong connection between the concept of graphs and social networks.
-  In social networks, entities can be individuals, groups, pages, etc., and the relationships between them can be friendships, followers, among others.
-  Social networks can be represented as graphs, where vertices represent users and edges represent connections between them (such as friendships, followers, etc).

## Development

- Java 8+
- IntelliJ IDEA

#### Class diagram

![Diagram](src/resources/diagram.png)

## How to use

There is no user input.

#### Features

- Create users
- Add users
- Show friend's feed
- Show global feed
- Search a user
- Show global network

#### Basic methods

```java
// Creating Local user
UserVertex myUser = new UserVertex("leomeister", "anime123", "email@gmail.com", "tuturu");

// Creating other users
UserVertex userVertex1 = new UserVertex("Fulano", "anime123", "email@gmail.com", "tuturu");
UserVertex userVertex2 = new UserVertex("Beltrano", "anime123", "email@gmail.com", "tuturu");

// Creating a post
userVertex1.createPost(LocalDateTime.now(), "Eae galera!").toString(userVertex1.getUsername());
```

Other methods with comments can be viewed in the source code.

## References

- https://www.ibm.com/docs/en/iii/10.0.0?topic=tool-social-network-graph
- https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/

## Contribute

Fork the repository and create a pull request.

## License

This project is licensed under the [Unlicense](https://unlicense.org/) - see the LICENSE file for details.
