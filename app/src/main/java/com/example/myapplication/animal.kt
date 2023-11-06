package com.example.myapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val name: String, val info: String, val age: String) : Parcelable