# LabSeq Calculator

## REST API

 - Built with Quarkus.
 - Exposes one endpoint, /labseq/{n}, where n is the value to be calculated. Returns the **n** parameter, the computation result and elapsed time, in nanoseconds.
 - Cache is implemented in memory as an HashMap for simplicity. Something like redis would be more adequate to not lose cached values when the server goes down.
 - API documentation is served on /swagger-ui

## Client

 - Angular app
 - Reads the input from the user and makes a request to the API, displaying the results

## Deployment

A docker-compose is provided, launching both the API and the web Client

```
$ docker-compose up --build
```

Both services can be accessed via the localhost interface:
  - Client: http://localhost:4200
  - API: http://localhost:8080 

