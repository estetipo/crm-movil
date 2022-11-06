package mx.com.satoritech.domain.request

data class GenericResponse<T> (
    var success: Boolean = false,
    var message: String = "",
    var code: Int = 404,
    var data: T?
)