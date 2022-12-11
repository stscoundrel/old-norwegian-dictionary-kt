package io.github.stscoundrel.oldnorwegian

import java.io.InputStreamReader
import com.google.gson.Gson

class OldNorwegianDictionary {
    private val DICTIONARY_RESOURCE_PATH = "/old-norwegian-dictionary.json"
    private var entries: Array<DictionaryEntry> = arrayOf()
    private val gson = Gson()

    private fun readDictionary(): Array<DictionaryEntry> {
        val inputStream = javaClass.getResourceAsStream(DICTIONARY_RESOURCE_PATH)
        val reader = InputStreamReader(inputStream)

        val result = gson.fromJson(reader, Array<DictionaryEntry>::class.java)

        return result
    }

    fun getEntries(): Array<DictionaryEntry> {
        if (entries.isEmpty()) {
            entries = readDictionary()
        }

        return entries
    }
}