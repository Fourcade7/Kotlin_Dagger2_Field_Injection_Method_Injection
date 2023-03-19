package com.pr7.kotlin_dagger2_constructor_injection

import com.pr7.kotlin_dagger2_field_injection.Injector
import com.pr7.kotlin_dagger2_field_injection.YouTube
import javax.inject.Inject


class Google {

    @Inject
    lateinit var youTube:YouTube

    init {
        val component=Injector.component.inject(this)

    }


}