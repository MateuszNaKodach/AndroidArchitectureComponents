package io.github.nowakprojects.androidarchitecturecomponents.dagger

import dagger.Component
import io.github.nowakprojects.androidarchitecturecomponents.ui.viewmodel.MainViewModel
import javax.inject.Singleton

/**
 * Created by Mateusz on 27.09.2017.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface DependencyInjector{

    fun inject(mainViewModel: MainViewModel)
}