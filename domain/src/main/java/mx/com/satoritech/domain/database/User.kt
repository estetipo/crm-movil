package mx.com.satoritech.domain.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "user")
data class User (
    @PrimaryKey
    var id: Long? = null,

    var name:String? = null,

    @SerializedName("last_name")
    var lastName:String? = null,

    var phone:String? = null,

    var email:String? = null,

    @SerializedName("photo_url")
    var photoUrl:String? = null,

    @SerializedName("api_token")
    var apiToken : String? = null,
)