package io.github.stscoundrel.oldnorwegian

import java.io.InputStreamReader
import com.google.gson.Gson

class OldNorwegianDictionary {
    private val DICTIONARY_RESOURCE_PATH = "/old-norwegian-dictionary.json"
    private val dictionaryEntries: Array<DictionaryEntry> by lazy { readDictionary() }
    private val gson = Gson()

    private fun readDictionary(): Array<DictionaryEntry> {
        val inputStream = javaClass.getResourceAsStream(DICTIONARY_RESOURCE_PATH)
        val reader = InputStreamReader(inputStream)

        return gson.fromJson(reader, Array<DictionaryEntry>::class.java)
    }

    fun getEntries(): Array<DictionaryEntry> {
        // Exists mostly to preserve existing interface.
        return dictionaryEntries
    }
}