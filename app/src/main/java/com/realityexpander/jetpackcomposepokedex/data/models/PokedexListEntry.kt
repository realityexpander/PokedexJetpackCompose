package com.realityexpander.jetpackcomposepokedex.data.models

import androidx.compose.ui.graphics.Color

data class PokedexListEntry(
    val pokemonName: String,
    val imageUrl: String,
    val number: Int,
    var dominantColor: Color? = null,
)
