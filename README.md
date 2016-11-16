# Agile Boiler Plate

This boilerplate covers the needs of most of the Android apps that you can think of. It's simple, well architected and easily adjustable to your specific requirements.

The project is fully based in Dependency Injection design pattern using Dagger2. Which adds a layer of separation and makes things even less coupled.

The dependencies currently handled by the boiler plate are the following:
- Database dependency: encapsulates all the database operations.
- Shared preferences dependency: deals with shared preferences.
- Local Storage dependency: which deals with saving on files.
- Analytics dependency: covers all the operation of reporting events to your analytics backend (GA, Segment, FB, Flurry ..)
- Logging dependency: encapsulates all the operations related to logging to your console
- Api dependency: encapsulates all the API related operations


The power of dependency injection comes really handy especially for testing since you can easily switch your dependencies in the test environment to dummy dependencies.

As an example, you can change your Api dependency on testing environment so it returns a specific response without doing the actual call to your server. Share pref dependency can be overridden to return specific values for certain keys instead of saving and retrieving actual values in your test device, and the same applies for local storage and data dependencies. Both logging and analytics dependencies can be overridden to deliver the logs and reports to a server or file to be analyzed after running the tests instead of the console or the actual analytics server.

Moreover, dependency injection makes it really easy when you need to change certain dependencies let's say moving from google analytics to flurry, Or migrating from DbFlow database to SQLBrite.

The boiler plates consist of 4 layers: View, Presenter, Controller, Model. The communication between the layers is all done using EventBus Design pattern. I'm using a custom bus implemented using RxJava.



## Architecture

The boiler plate is based on MVP architecture (Model, View, Presenter) which is better than MVC when it comes to coupling. MVP makes your view code way cleaner than when using MVC, since the Views, Activities and the fragments will only have the code related to rendering the customizing the UI and no interactions with the controllers.



![MVP architecture](https://s11.postimg.org/t10gd5p83/Screen_Shot_2016_11_16_at_3_34_01_PM.png)



## Prerequisites

- JDK 1.8
- [Android SDK](http://developer.android.com/sdk/index.html).
- Android N [(API 24) ](http://developer.android.com/tools/revisions/platforms.html).
- Latest Android SDK Tools and build tools.





## Running the tests

Libraries and tools included:
- Support libraries
- RecyclerViews and CardViews
- [RxJava](https://github.com/ReactiveX/RxJava)
- [Retrofit 2](http://square.github.io/retrofit/)
- [Retrolambda](https://github.com/orfjackal/retrolambda)
- [Dagger 2](http://google.github.io/dagger/)
- [DbFlow](https://github.com/Raizlabs/DBFlow)
- [Butterknife](https://github.com/JakeWharton/butterknife)
- [Timber](https://github.com/JakeWharton/timber)
- [Glide](https://github.com/bumptech/glide)
- Functional tests with [Espresso](https://google.github.io/android-testing-support-library/docs/espresso/index.html)
- [Robolectric](http://robolectric.org/)
- [Mockito](http://mockito.org/)



## Authors

* **Abed Almoradi** - *Senior Android Developer at Avast* - [Linkedin](https://www.linkedin.com/in/abdalmunem)


## License

This project is licensed under  Apache License Version 2.0 - see the [LICENSE.md](http://www.apache.org/licenses/LICENSE-2.0) file for details

## Acknowledgments

* [Ribot Boiler Plate](https://github.com/ribot/android-boilerplate)
* [Mindvalley](www.mindvalley.com)