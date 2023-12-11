package com.example.recycleview

import android.os.Parcel
import android.os.Parcelable

data class album(val image:Int , val name:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<album> {
        override fun createFromParcel(parcel: Parcel): album {
            return album(parcel)
        }

        override fun newArray(size: Int): Array<album?> {
            return arrayOfNulls(size)
        }
    }
}
