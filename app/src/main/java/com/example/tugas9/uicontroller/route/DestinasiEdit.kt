package com.example.tugas9.uicontroller.route

import com.example.tugas9.R

object DestinasiEdit: DestinasiNavigasi {

    override val route = "edit_detail"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idsiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}