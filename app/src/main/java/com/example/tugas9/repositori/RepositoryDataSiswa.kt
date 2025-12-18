package com.example.tugas9.repositori

import com.example.tugas9.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
    //
}