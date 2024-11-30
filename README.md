# Old Norwegian Dictionary

Old Norwegian/Norse Dictionary for Kotlin / Java. The dictionary consists of 40 000+ Old Norse words with Norwegian translations.

Based on "Dictionary of the Old Norwegian Language". Data source build from [Old Norwegian Dictionary Builder](https://github.com/stscoundrel/old-norwegian-dictionary-builder)


## Install

As Maven dependency.

```xml
<dependency>
  <groupId>io.github.stscoundrel</groupId>
  <artifactId>oldnorwegian</artifactId>
  <version>0.2.0</version> <!-- Note! Check latest release number -->
</dependency>
```

For alternative install methods, see the [Maven Central Repo](https://search.maven.org/artifact/io.github.stscoundrel/oldnorwegian)

### Usage

In Kotlin:

```kotlin

import io.github.stscoundrel.oldnorwegian.OldNorwegianDictionary
import io.github.stscoundrel.oldnorwegian.DictionaryEntry

// Whole dictionary of +42 000 entries
val dictionary = OldNorwegianDictionary()
val entries = dictionary.getEntries()

// Dictionaries return entries that consist of headword, part of speech and definition.
println(entries[25000].headword)       // náðuliga
println(entries[25000].partOfSpeech)   // adv
println(entries[25000].definition)     // náðuliga, adv.  1)  i 

```

In Java:

```kotlin
// Imports are the same
import io.github.stscoundrel.oldnorwegian.OldNorwegianDictionary
import io.github.stscoundrel.oldnorwegian.DictionaryEntry

// Fetching dictionary dataset is the similar
OldNorwegianDictionary dictionary = new OldNorwegianDictionary();
List<DictionaryEntry> entries = dictionary.getEntries();

// Entry handling is different: Kotlin code uses data classes for entries.
// Therefore, the members of the classes are private in Java.
// Kotlin automatically generates getters for the members that you can use instead.
println(entries[25000].getHeadword())       // náðuliga
println(entries[25000].getPartOfSpeech())   // adv
println(entries[25000].getDefinition())     // náðuliga, adv.  1)  i 

```

### About "Dictionary of the Old Norwegian Language"

_"Ordbog over det gamle norske Sprog"_ dictionary was published in late 1800s by Johan Fritzner. Its is the largest Old Norse to Norwegian dictionary, containing over 40 000 word definitions. While the original dictionary is called dictionary of "Old Norwegian", it is practically a dictionary of western Old Norse. Technically "Old Norwegian" would be a later stage in the language.
