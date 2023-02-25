package com.plcoding.jetpackcomposepokedex.data.models

import androidx.compose.ui.graphics.Color

data class PokedexListEntry(
    val pokemonName: String,
    val imageUrl: String,
    val number: Int,
    var dominantColor: Color? = null,
    var _randomizer: Int = 0
)
