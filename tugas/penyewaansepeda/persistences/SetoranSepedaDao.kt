package tugas.penyewaansepeda.persistences

import androidx.lifecycle.LiveData


import androidx.room.*
import tugas.penyewaansepeda.model.SetoranSepeda

@Dao
interface SetoranSepedaDao {
    @Query("SELECT * FROM SetoranSepeda")
    fun loadAll(): LiveData<List<SetoranSepeda>>
    @Query("SELECT * FROM SetoranSepeda WHERE id = :id")
    fun find(id: String): SetoranSepeda?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: SetoranSepeda)
    @Delete
    fun delete(item: SetoranSepeda)
}