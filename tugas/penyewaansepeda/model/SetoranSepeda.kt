package tugas.penyewaansepeda.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class SetoranSepeda(
    @PrimaryKey val id:String,
    val tanggalsewa:String,
    val tanggalkembali:String,
    val jenis: String,
    val nama: String,
    val keterangan: String

)