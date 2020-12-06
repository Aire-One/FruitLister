# Fruit Lister, my take on _self-teach-modern-android-development-by-building-a-simple-app_

I developed this application to self-teach modern Android development with
Kotlin featuring MVVM pattern, Dagger Hilt, Retrofit, Room, Navigation
Component, DataBinding and Clean Architecture.

Objective of this project is to use the https://www.fruityvice.com/ API
to list fruits and access to their details by clicking on items on the list.

Project based on the Master/Detail Flow template.

# References

## Architecture

* https://developer.android.com/jetpack/guide
* https://developer.android.com/topic/libraries/architecture/coroutines
* https://developer.android.com/topic/libraries/architecture/viewmodel#kotlin
* https://proandroiddev.com/mvvm-architecture-viewmodel-and-livedata-part-1-604f50cda1
* https://medium.com/android-dev-hacks/detailed-guide-on-android-clean-architecture-9eab262a9011

### Example application

* https://github.com/PatilShreyas/Foodium
* https://itnext.io/android-architecture-hilt-mvvm-kotlin-coroutines-live-data-room-and-retrofit-ft-8b746cab4a06
* https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/DevBytesRepository

## UI

### Architecture

* https://www.raywenderlich.com/1364094-android-fragments-tutorial-an-introduction-with-kotlin
* https://stackoverflow.com/questions/10478233/why-fragments-and-when-to-use-fragments-instead-of-activities
* https://proandroiddev.com/android-fragments-fragmentcontainerview-292f393f9ccf

### Fragment

* https://developer.android.com/guide/components/fragments
* https://developer.android.com/reference/androidx/fragment/app/FragmentContainerView
* https://medium.com/@pavan.careers5208/fragmentcontainerview-c39d8ac376d1

### RecyclerView, Adapter

* https://developer.android.com/guide/topics/ui/layout/recyclerview
* https://developer.android.com/reference/kotlin/android/widget/Adapter

### DataBinding

* https://developer.android.com/topic/libraries/data-binding
* https://medium.com/@temidjoy/android-jetpack-empower-your-ui-with-android-data-binding-94a657cb6be1
* https://medium.com/androiddevelopers/android-data-binding-recyclerview-db7c40d9f0e4
* https://www.raywenderlich.com/7711166-data-binding-in-android-getting-started

### Navigation Component

* https://developer.android.com/guide/navigation/navigation-getting-started
* https://blog.codemagic.io/android-navigation-introduction
* https://developer.android.com/guide/navigation/navigation-migrate
* https://github.com/android/architecture-components-samples/tree/master/NavigationBasicSample

### SafeArgs

* https://developer.android.com/guide/navigation/navigation-pass-data#Safe-args
* https://developer.android.com/reference/android/os/Parcelable.html
* https://medium.com/the-lazy-coders-journal/easy-parcelable-in-kotlin-the-lazy-coders-way-9683122f4c00

## Business

### ViewModel

* https://developer.android.com/topic/libraries/architecture/viewmodel
* https://developer.android.com/reference/androidx/lifecycle/ViewModel
* https://medium.com/androiddevelopers/viewmodels-with-saved-state-jetpack-navigation-data-binding-and-coroutines-df476b78144e
* https://developer.android.com/guide/navigation/navigation-programmatic#share_ui-related_data_between_destinations_with_viewmodel
* https://developer.android.com/guide/navigation/navigation-nested-graphs
* https://developer.android.com/topic/libraries/architecture/livedata.html#kotlin
* https://developer.android.com/topic/libraries/architecture/viewmodel-savedstate
* https://developer.android.com/topic/libraries/architecture/coroutines#livedata
* https://medium.com/@taman.neupane/basic-example-of-livedata-and-viewmodel-14d5af922d0
* https://medium.com/@atifmukhtar/recycler-view-with-mvvm-livedata-a1fd062d2280
* https://medium.com/@nikitaverma081996/nested-navigation-graph-f9be9a71c557
* https://www.reddit.com/r/androiddev/comments/bu4biv/how_do_i_handle_button_presses_in_a_recyclerview/

### Retrofit

* https://antonioleiva.com/retrofit-android-kotlin/
* https://dev.to/paulodhiambo/kotlin-and-retrofit-network-calls-2353
* https://medium.com/mobile-app-development-publication/kotlin-and-retrofit-2-tutorial-with-working-codes-333a4422a890
* https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/MarsRealEstateNetwork
* https://proandroiddev.com/moshi-with-retrofit-in-kotlin-%EF%B8%8F-a69c2621708b
* https://square.github.io/retrofit/2.x/retrofit/retrofit2/Retrofit.html

### Hilt

* https://developer.android.com/training/dependency-injection
* https://dagger.dev/hilt/
* https://developer.android.com/training/dependency-injection/hilt-android
* https://medium.com/androiddevelopers/a-pragmatic-guide-to-hilt-with-kotlin-a76859c324a1
* https://developer.android.com/training/dependency-injection/hilt-jetpack

### Room

* https://developer.android.com/training/data-storage/room
* https://developer.android.com/jetpack/androidx/releases/room
* https://developer.android.com/reference/androidx/room
* https://medium.com/@svvashishtha/using-room-with-hilt-cb57a1bc32f

### Coroutines

* https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html
* https://developer.android.com/kotlin/coroutines

#### Coroutines with Retrofit

* https://dev.to/wise4rmgod/the-beauty-of-retrofit-2-6-0-with-coroutines-support-3ddm
* https://medium.com/swlh/learn-by-doing-coroutines-a-guide-for-using-coroutines-in-android-for-retrofit-requests-eaef6ca58c7e
* https://proandroiddev.com/suspend-what-youre-doing-retrofit-has-now-coroutines-support-c65bd09ba067
* https://levelup.gitconnected.com/coroutines-retrofit-and-a-nice-way-to-handle-responses-769e013ee6ef

#### Coroutines with Room

* https://www.raywenderlich.com/7414647-coroutines-with-room-persistence-library#toc-anchor-007