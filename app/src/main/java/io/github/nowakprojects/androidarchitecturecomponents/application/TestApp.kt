package io.github.nowakprojects.androidarchitecturecomponents.application

import android.app.Application
import io.github.nowakprojects.androidarchitecturecomponents.dagger.AppModule
import io.github.nowakprojects.androidarchitecturecomponents.dagger.DaggerDependencyInjector
import io.github.nowakprojects.androidarchitecturecomponents.dagger.DependencyInjector

/**
 * Created by Mateusz on 27.09.2017.
 */
class TestApp : Application() {

    companion object {
        lateinit var dependencyInjector: DependencyInjector
    }

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
        dependencyInjector =
                DaggerDependencyInjector.builder()
                        .appModule(AppModule(applicationContext))
                        .build()
    }
}