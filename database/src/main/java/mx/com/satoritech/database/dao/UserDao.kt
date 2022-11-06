package mx.com.satoritech.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.coroutines.flow.Flow
import mx.com.satoritech.domain.database.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(user: User): Long

    @Query("SELECT * FROM user LIMIT 1")
    fun get(): Flow<User?>

    @Query("SELECT * FROM user LIMIT 1")
    fun getWithLiveData(): LiveData<User?>

    @Query("DELETE FROM user")
    suspend fun deleteAll()

    @Update
    suspend fun update(userDB: User)
}