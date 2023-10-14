# Movies 

Jetpack Compose, Room, MVVM, Coil, Navigation Component,  Coroutines, Hilt , Unit Testing


## Libraries and Frameworks
- [Navigation component](https://developer.android.com/guide/navigation) - Navigation with Compose.
- [Retrofit & OkHttp](https://github.com/square/retrofit) - Networking.
- [Coil](https://github.com/coil-kt) - Image loading.
- [Hilt](http://google.github.io/hilt/) - Dependency injection.
- [Room](https://developer.android.com/jetpack/androidx/releases/room) -  Database.
- [Kotlin Flows](https://kotlinlang.org/docs/reference/coroutines/flow.html) - Reactive programming.
- [Mockito-Kotlin](https://github.com/nhaarman/mockito-kotlin) - a small library that provides helper functions to work with Mockito in Kotlin.

## Clean Architecture + MVVM + Offline first
- Data (database, API and preferences code)
- Domain (business logic)
- UI (for presentation logic, using MVVM with finite state machine pattern)

## To run app:

-clone repository

-run build

-set account in themoviewdb api

-add your api key to gradle.properties file

* **Add your [Movies API][13] Key in `gradle.properties` file to make movies fetch work.**


[13]: https://api.themoviedb.org/

## TODO Future enhancement app:
- [ ] Do more detail layouts
- [ ] add pagination
- [ ] support rtl
- [ ] add kotlin-dsl with center build src to control dependencies
- [ ] enhancement in ui
- [ ] add more unit testing , ui test
- [ ] use Mockk library for testing

