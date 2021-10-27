# Fake Quanti s.r.o. blog API
This application is a simple API stub for the Java entry test. For more information on the task, see repository [java-entry-test](https://github.com/QuantiCZ/java-entry-test).

## How to boot
### Docker
The easiest way to boot the Blog API up is via [Docker](https://www.docker.com/). As you can see, this application
already has `Dockerfile` and `docker-compose.yml` pre-configured.

To boot the application, simply run `docker compose up` in the same folder as this readme file. The resulting docker
container will expose port 8081, so to access the API you will be making requests to `localhost:8081`.

### Standalone
In the case that you may want to boot the application without Docker, you may do so manually.

1. Build the application via Maven: `mvn clean package`.
2. Run the resulting `target/java-entry-test-blog-api-1.0.0.jar`. The application will also start on port 8081.

## How to use
Blog API exposes a single endpoint `/posts`, which accepts `GET` requests and doesn't use any query parameters. The
endpoint returns a JSON list of dummy blog posts, which you may use to complete the recruitment task provided to you.

Example of an item returned by `/posts`:

```json
[
  {
    "id": 1,
    "title": "Eyeless in Gaza",
    "authorName": "The Albino",
    "summary": "He is only mostly dead. Not all dead. You can bring them back to life if they are only mostly dead. Now, give me that stick. There is nothing better than true love in the whole world. Except a nice MLT. Mutton, lettuce, and tomato when the mutton is nice and lean and the lettuce is nice and crisp. Ohhh you can't beat it.",
    "created": "2020-01-10T12:00:00Z",
    "updated": "2021-01-02T14:15:35Z"
  },
  {
    "id": 2,
    "title": "The Lathe of Heaven",
    "authorName": "Count Rugen",
    "summary": "You mean you'll put down your rock and I'll put down my sword, and we'll try and kill each other like civilized people? It's not my fault being the biggest and the strongest. I don't even exercise.",
    "created": "2020-02-10T12:00:00Z",
    "updated": "2021-02-02T14:15:35Z"
  }
]
```
