###Running my gatling on your local machine


1) Verify you have the following versions installed/higher: java v 1.8+, scala 2.11.6+, sbt 0.13.8
2) Git clone into your working directory
3) Run the following command : SBT_OPTS="-Durl=http://gateway.marvel.com" sbt


Passing Arguments:
Currently I can pass in at runtime , the following.
-url: (-Durl)I can pass in the mask url as long the baseurl is constant, so www.google.com is the baseurl and /testApi is the mask
-users: (-Dusers)I can pass in the # of users , default is 1 since we are functionally testing the api, but if we wanted to simulate 100 users it can be easily done

