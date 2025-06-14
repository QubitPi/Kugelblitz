---
sidebar_position: 2
title: Markdown-Dokumentations-Styleguide
---

Markdown eignet sich hervorragend zum Schreiben von Dokumentationen. GitHub stellt es nativ sehr ansprechend und
konsistent dar, lässt sich problemlos in verschiedene andere Formate konvertieren und ist auch ohne Rendering (z. B. als
Text) gut lesbar. Wie bei allem, was Rich Formatting unterstützt, ist das optimale Format jedoch nicht immer eindeutig,
und das Verstehen von Dokumentationen ist besonders schwierig, wenn kein klarer, konsistenter Stil in der gesamten
Dokumentation verwendet wird.

Um sicherzustellen, dass die Kugelblitz-Dokumentation einheitlich ist (nicht wörtlich...), finden Sie hier einige
allgemeine Richtlinien zur Markdown-Formatierung:

Blockformatierung sinnvoll einsetzen
------------------------------------

- Überschriften geben einen Überblick über den Inhalt eines Dokuments und dienen den Lesern als Orientierungshilfe.
  Nutzen Sie sie!

  - H1- und H2-Überschriften sollten durch Unterstriche (`===` bzw. `---`) und nicht durch vorangestellte Rauten (`#`)
    definiert werden.
  - Bei Überschriften mit Unterstrichen sollten diese die gleiche Zeichenanzahl wie der Text der Überschrift haben.
  - Bei Überschriften mit vorangestellten Rauten sind nachfolgende Rauten optional, die Anzahl der nachfolgenden Rauten
    muss jedoch mit der Anzahl der vorangestellten Rauten übereinstimmen, falls vorhanden.

- Bei Zitaten aus anderen Quellen verwenden Sie ein Blockzitat (`>` am Zeilenanfang).
- Ein Codebeispiel (in einem Codeblock) ist oft die beste Möglichkeit, etwas zu veranschaulichen oder ein Beispiel zu
  zeigen. Verwenden Sie es großzügig!
- Listen eignen sich hervorragend, um Informationen in kleine, leicht verständliche Abschnitte zu unterteilen.

  - Verwenden Sie hängende Einzüge für mehrzeilige Listenelemente.
  - Bei „überschriftsähnlichen“ Listen können Sie __bolding__ verwenden, um die Hauptlistenelemente bei Bedarf in
    „Pseudo-Überschriften“ umzuwandeln. Generell ist es besser, Überschriften zu verwenden, aber diese funktionieren
    nicht immer gut (insbesondere wenn sie sehr lang sind).
  - Listen im Stil von Definitionslisten können den Begriff oder die Phrase durch Fettdruck von der Definition abheben.

Dokumente durch Verlinken interaktiv gestalten
----------------------------------------------

- Verlinken Sie auf andere Stellen im Dokument (z. B. Überschriften oder Abschnitte) oder auf andere Dokumente oder
  Ressourcen.
- Fügen Sie bei langen oder komplexen Dokumenten ein Inhaltsverzeichnis ein.
- Verlinken Sie auf Tests oder tatsächlichen Code innerhalb der Codebasis, um ein Beispiel zu zeigen.
- Verlassen Sie sich nicht auf die automatische Verlinkung von URLs. Geben Sie dem Link im Dokumentationstext einen
  aussagekräftigeren Namen. Links sollten im Referenzstil verwendet werden:

  ```markdown
  [Linktext][Linkreferenz]
  [Beispiel-Linktext][Beispiel-Link]

  [Linkreferenz]: <tatsächliche URL>
  [Beispiel-Link]: http://example.com
  ```

  anstelle des Inline-Stils:

  ```markdown
  [Beispiel](http://example.com)
  ```

- Linkreferenzen sollten am Ende des Dokuments alphabetisch nach Linkreferenz sortiert und mit einer Leerzeile zwischen
  den einzelnen Buchstaben angeordnet werden:

  ```markdown
  [ein Beispiel-Link]: http://example.com
  [ein weiterer Beispiel-Link]: http://example.com

  [sei der Beispiel-Link, der du sein solltest]: http://example.com

  [Beispiel-Link]: http://example.com
  ```

- Inline-Links können verwendet werden, wenn auf andere Markdown-Dokumente am selben Ort verwiesen wird. Beispiel:

  ```Markdown
  [Beispiellink](Geschwisterdokument)
  ```

- Referenzen sollten explizit angegeben werden. Die folgenden Bedeutungen sind in GitHub-Markdown identisch:

  ```markdown
  [Beispiellink][Beispiellink] <-- Bevorzugt
  [Beispiellink]
  [Beispiellink][]

  [Beispiellink]: http://example.com
  ```

  Die erste Variante (die explizite Angabe der Referenz) entkoppelt jedoch den Linktext vom Referenznamen und ist daher
  unempfindlicher gegenüber Änderungen.

Konsistente Hervorhebung wichtiger Aspekte
------------------------------------------

- Hervorgehobene Ausdrücke sollten kursiv mit einem einfachen Unterstrich (`_`) hervorgehoben werden.
- Sehr wichtige Informationen, wie Warnungen oder Vorsichtshinweise, sollten fett mit einem doppelten Unterstrich (`__`)
  hervorgehoben werden.
- Extrem wichtige Informationen, wie potenzieller Datenverlust oder andere kritische Informationen, sollten fett und
  kursiv mit einem dreifachen Unterstrich (`___`) hervorgehoben werden.

Leerzeilen sinnvoll verwenden
---------------------------

- Überschriften sollten eine Leerzeile enthalten, bevor der Inhalt des jeweiligen Abschnitts beginnt.
- Überschriften sollten eine Leerzeile enthalten, wenn ihnen anderer Inhalt vorangeht.
