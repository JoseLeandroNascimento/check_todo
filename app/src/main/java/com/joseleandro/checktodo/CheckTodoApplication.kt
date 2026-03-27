package com.joseleandro.checktodo

import android.app.Application
import com.joseleandro.checktodo.core.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CheckTodoApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@CheckTodoApplication)
            modules(uiModule)
        }
    }
}