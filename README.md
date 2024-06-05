# Movie Recommendation System with Spring Boot and Drools Rule Engine

This project implements a movie recommendation system using Spring Boot and the Drools rule engine. The system analyzes user preferences to generate personalized recommendations.

## Features

- Generates movie recommendations based on user preferences.
- Integrates Drools rule engine for flexible and efficient rule-based recommendation generation.
- Provides a RESTful API for interacting with the recommendation system.
- Utilizes Spring Boot for rapid development and easy deployment.

## Setup

1. **Clone the repository**:

```bash
git clone https://github.com/mmoaztehseen/movie-recommendation-system-springboot-drools-rule-engine.git
```

2. **Navigate to the project directory**:

```bash
cd recommendation
```

3. **Build the project**:

```bash
mvn clean install
```

4. **Run the application**:

```bash
mvn spring-boot:run
```

## Access the endpoint

The API will be available at [http://localhost:8080/api/recommendations](http://localhost:8080/api/recommendations). You can use tools like Postman to interact with the endpoints.

## **POST (/api/recommendations)**:

Generates movie recommendations for a given user.

- **Request Body**:

```json
{
  "username": "test_user",
  "age": 30,
  "favoriteGenres": ["Comedy", "Drama"],
  "watchedMovieIds": []
}
```

- **Response**:

```json
[
  {
    "id": 5,
    "title": "The Hangover",
    "genre": "Comedy",
    "description": "Three friends wake up from a bachelor party in Las Vegas, with no memory of the previous night.",
    "rating": 7.7,
    "director": "Todd Phillips",
    "releaseYear": 2009
  },
  {
    "id": 6,
    "title": "The Shawshank Redemption",
    "genre": "Drama",
    "description": "Two imprisoned men bond over a number of years, finding solace and eventual redemption.",
    "rating": 9.3,
    "director": "Frank Darabont",
    "releaseYear": 1994
  },
  {
    "id": 4,
    "title": "Superbad",
    "genre": "Comedy",
    "description": "Two co-dependent high school seniors are forced to deal with separation anxiety.",
    "rating": 7.6,
    "director": "Greg Mottola",
    "releaseYear": 2007
  },
  {
    "id": 7,
    "title": "Forrest Gump",
    "genre": "Drama",
    "description": "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold through the perspective of an Alabama man with an IQ of 75.",
    "rating": 8.8,
    "director": "Robert Zemeckis",
    "releaseYear": 1994
  }
]
```
