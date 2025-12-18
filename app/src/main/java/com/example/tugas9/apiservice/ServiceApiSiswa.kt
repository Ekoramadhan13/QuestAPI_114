package com.example.tugas9.apiservice

import com.example.tugas9.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {

    @GET(value = "bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST (value = "insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>
}