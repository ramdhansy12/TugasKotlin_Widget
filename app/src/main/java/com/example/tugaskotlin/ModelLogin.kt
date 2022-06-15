package com.example.tugaskotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize



@Parcelize
 data class ModelLogin (
    var username : String,
    var Password : String

    ): Parcelable