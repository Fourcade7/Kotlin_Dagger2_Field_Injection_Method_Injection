package com.pr7.kotlin_dagger2_field_injection


import com.pr7.kotlin_dagger2_constructor_injection.Google
import dagger.Component


@Component
interface GoogleComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(google: Google)
}