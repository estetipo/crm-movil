package mx.com.satoritech.web

import retrofit2.Retrofit

class Token {
    companion object {
        @JvmStatic
        var token: String = ""
            set(value) {
                field = value
                retrofitInstance = null
            }

        @JvmStatic
        var retrofitInstance: ApiService? = null
    }
}