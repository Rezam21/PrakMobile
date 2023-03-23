package tugas.penyewaansepeda.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import tugas.penyewaansepeda.model.SetoranSepeda

@Database(entities = [SetoranSepeda::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun setoranSepedaDao(): SetoranSepedaDao
}