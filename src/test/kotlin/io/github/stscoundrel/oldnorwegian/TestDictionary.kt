package io.github.stscoundrel.oldnorwegian

import org.junit.Assert.assertEquals
import org.junit.Test

class OldNorwegianDictionaryTest {
    @Test
    fun `Dictionary has correct amount of entries`() {
        val dictionary = OldNorwegianDictionary()
        val result = dictionary.getEntries()

        assertEquals(42021, result.size)
    }

    @Test
    fun `Dictionary has expected content`() {
        val dictionary = OldNorwegianDictionary()
        val result = dictionary.getEntries()

        assertEquals("-æri", result[0].headword)
        assertEquals("uten ordklasse", result[0].partOfSpeech)
        assertEquals("-æri (af ár dvs. Aar) i hallæri.", result[0].definition)

        assertEquals("fri", result[10000].headword)
        assertEquals("m", result[10000].partOfSpeech)
        assertEquals("fri, m. = friðill. Hým. 9.", result[10000].definition)

        assertEquals("náðuliga", result[25000].headword)
        assertEquals("adv", result[25000].partOfSpeech)
        assertEquals(
            "náðuliga, adv.  1)  i Stilhed, ubemærket; hann bauð at hafa Hánef þar á launþar til, er skip kemr n. at, svá athonum mætti útan koma Vem. 591; B.biskup biðr nú því öruggari til guðsaf öllu hjarta, sem hann má þat náð-uligar ok leyniligar gera fyrir mönn-um Mar. 116911 fg; biðjandi því meðmeira athuga, sem hann mátti leyni-ligar ok auðveldligar (&vl náðuligar)Mar. 83710. 34.  2)  naadigen; biðjom vér,at þér takir þessum várum erendumbetr ok náðuligar, en vér erum verðirDN. VII, 19013.",
            result[25000].definition
        )

        assertEquals("þyrnir", result[42000].headword);
        assertEquals("m", result[42000].partOfSpeech);
        assertEquals("þyrnir, m. Tjørn, Tornebusk. Stj. 39611;Hom. 10218; Post. 75034; Klm. 54615;Mar. 3378. 10351.", result[42000].definition);
    }
}