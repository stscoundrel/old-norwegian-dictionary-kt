package io.github.stscoundrel.oldnorwegian

import com.google.gson.annotations.SerializedName

data class DictionaryEntry(
    @SerializedName("a") val headword: String,
    @SerializedName("b") val partOfSpeech: String,
    @SerializedName("c") val definition: String
) {
    fun hasPartOfSpeech(): Boolean {
        return partOfSpeech != "uten ordklasse"
    }
}