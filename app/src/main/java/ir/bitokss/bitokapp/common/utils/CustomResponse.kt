package ir.bitokss.bitokapp.common.utils

data class CustomResponse<T>(
    val status: Status,
    var data: T?,
    val message: String? = null,
) {

    enum class Status {
        SUCCESS,
        FAIL,
        ERROR,
        LOADING,
    }

    companion object {
        fun <T> success(data: T?): CustomResponse<T> =
            CustomResponse(Status.SUCCESS, data, null)

        fun <T> error(
            message: String?,
            data: T? = null,
        ): CustomResponse<T> =
            CustomResponse(Status.ERROR, data, message)

        fun <T> fail(
            message: String?, title: String? = null, data: T? = null
        ): CustomResponse<T> =
            CustomResponse(Status.FAIL, data, message)

        fun <T> loading(
            data: T? = null,
        ): CustomResponse<T> =
            CustomResponse(Status.LOADING, data, null)
    }

    override fun toString(): String {
        return "Result(status=$status, data=$data, message=$message)"
    }

}