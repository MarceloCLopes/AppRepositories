package com.mcl.apprepositories

import android.app.Application
import com.mcl.apprepositories.data.di.DataModule
import com.mcl.apprepositories.domain.di.DomainModule
import com.mcl.apprepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}