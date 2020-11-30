package com.example.fruitlister.di

import android.content.Context
import com.example.fruitlister.data.local.AppDatabase
import com.example.fruitlister.data.remote.FruityviceService
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class AppModule {

    @Provides
    fun provideMosh(): Moshi = Moshi.Builder().build()

    @Singleton
    @Provides
    fun provideRetrofit(moshi: Moshi): Retrofit = Retrofit.Builder()
        .baseUrl(FruityviceService.FRUITYVICE_API_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    @Provides
    fun provideFruityviceService(retrofit: Retrofit): FruityviceService = retrofit.create(FruityviceService::class.java)

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase = AppDatabase.getDatabase(appContext)

    @Singleton
    @Provides
    fun provideFruitDao(db: AppDatabase) = db.FruitDao()

}