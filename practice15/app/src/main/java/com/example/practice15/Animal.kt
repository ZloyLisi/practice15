package com.example.practice15

import android.os.Parcel
import android.os.Parcelable
import java.time.Month

class Animal() :Parcelable {
    private var breed: String = ""
    private var year: Int = 0
    private  var month: Int = 0

    constructor(parcel: Parcel) : this() {
        breed = parcel.readString().toString()
        year = parcel.readInt()
        month = parcel.readInt()
    }

    constructor(_bread: String, _year: Int, _month: Int) : this(){
        breed = _bread
        year = _year
        month = _month

    }
    fun setBreed (_bread: String){
        breed = _bread
    }
    fun getBreed ():String{
        return breed
    }
    fun setYear (_year: Int){
        year = _year
    }
    fun getYear ():Int{
        return year
    }
    fun setBreed (_month: Int){
        month = _month
    }
    fun getMonth ():Int{
        return month
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(breed)
        parcel.writeInt(year)
        parcel.writeInt(month)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }

    }
}