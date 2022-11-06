package mx.com.satoritech.web

object APIConstants {
    const val serverPath = "192.168.1.7/satoricrm/public"
    const val serverPathProduction = ""
    const val wsPath = "api_app/"

    private const val production: Boolean = false

    fun getServerPath(): String {
        return if(production)  serverPathProduction else serverPath
    }
}