package com.goda.pmovie.utils

import android.app.Application
import com.goda.pmovie.R


class TestApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        setTheme(R.style.Theme_PopularMovies)
    }
}