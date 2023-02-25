package com.realityexpander.jetpackcomposepokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.realityexpander.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.realityexpander.jetpackcomposepokedex.repository.PokemonRepository
import com.realityexpander.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}