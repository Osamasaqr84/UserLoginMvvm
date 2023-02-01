package com.noname.login.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginResponse(val userId :String,var token :String?):Parcelable
