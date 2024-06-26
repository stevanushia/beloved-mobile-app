package com.proyekmokom.chastethrift

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Silahkan mengubah isi dari adapter untuk kenyamanan
 * Kerjakan juga inisialisasi table database disini
 */

@Entity(tableName = "user")
data class UserEntity (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_user") val id_user:Int?, // ? artinya boleh NULL
    @ColumnInfo(name = "gambar") val gambar:Int = R.drawable.ic_user, // Gambar awal register otomatis ic_user.png dari drawable
    @ColumnInfo(name = "username") val username:String,
    @ColumnInfo(name = "password") val password:String,
    @ColumnInfo(name = "role") val role:Int, // 1 = penjual; 2 = pembeli; 3 = admin
    @ColumnInfo(name = "status") val status:Int = 1 // 0 = non-aktif; 1 = aktif
)