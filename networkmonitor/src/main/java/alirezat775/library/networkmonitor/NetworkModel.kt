package alirezat775.library.networkmonitor

import okhttp3.Headers
import okhttp3.HttpUrl
import okhttp3.RequestBody
import okhttp3.ResponseBody

/**
 * Author:  Alireza Tizfahm Fard
 * Date:    2019-12-30
 */

data class RequestNetworkModel(
    val url: HttpUrl,
    val method: String,
    val headers: Headers,
    val body: RequestBody?
)

data class ResponseNetworkModel(
    val code: Int,
    val message: String,
    val headers: Headers,
    val body: ResponseBody?
)