package mx.com.satoritech.web

import mx.com.satoritech.domain.database.User
import mx.com.satoritech.domain.request.GenericResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST(APIConstants.wsPath + "login")
    suspend fun login(@Body user: User): Response<GenericResponse<User>>
}