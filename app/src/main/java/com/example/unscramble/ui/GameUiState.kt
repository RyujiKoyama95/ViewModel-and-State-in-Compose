package com.example.unscramble.ui

data class GameUiState(
    val currentScrambledWord: String = "",
    val isGuessWordWrong: Boolean = false
)