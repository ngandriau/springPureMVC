# Introduction

This project is a sample of springMVC
Built while reading the spring in action 3rd edition
Use spring-webmvc 4.0.2
No security, no transaction, just 1 controller, 1 view jsp and 1 url:

    http://<host>:<port>/<context>/home

Use gradle to build, but not integrated with tomcat or jetty yet

developped with intellij idea with pleasure ;-)

The branches of this project will add other spring components
Inside a branch, tags will help to review the milestones, like new feature or new version integrated

#REST branch add some rest resource controller as the "PersonRestResource"

    http://<host>:<port>/<context>/rest/persons/id_1

OAUTH2-REST branch securize the REST resource with the OAUTH2 support by spring.

Currently the /rest/persons/id resource is protected. Client need to request a token

Call to get a token:

    $ curl -X POST -d "client_id=the_client&client_secret=1234567890grant_type=client_credentials" http://localhost:8080/oauth/token

response sample:

     {"access_token":"a40319bf-5534-4677-8b8c-bc31353a0697","token_type":"bearer","expires_in":399907}


Secure Rest call using previous token

     curl -H "Authorization: $tokenType $token" http://localhost:8080/rest/persons
     curl -H "Authorization: bearer a40319bf-5534-4677-8b8c-bc31353a0697" http://localhost:8080/rest/persons/1

