package mx.com.satoritech.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import mx.com.satoritech.database.dao.UserDao
import mx.com.satoritech.domain.database.User

@Database(entities = [User::class], version = 1)
abstract class DBAppCRM: RoomDatabase() {

    abstract fun userDao(): UserDao

    companion object{
        @JvmStatic
        fun newInstance(context:Context):DBAppCRM{
            return Room.databaseBuilder(context,DBAppCRM::class.java,"DBAppCRM")
                .fallbackToDestructiveMigration()
                .build()
        }
    }
}