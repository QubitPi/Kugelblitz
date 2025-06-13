---
sidebar_position: 1
title: Code-Review-PR-Workflow
---

Code-Reviews über Pull Requests (PRs) sind ein wichtiger Aspekt der Entwicklung, da sie einen der wichtigsten
Kommunikationskanäle für Änderungen in der Codebasis an alle Beteiligten darstellen. Den Status eines PRs zu bestimmen,
ist jedoch nicht immer einfach, insbesondere bei sehr aktiven PRs mit vielen Kommentaren und Diskussionen. Dieses
Dokument beschreibt, wie wir GitHub-Labels verwenden, um den Status eines PRs zu kennzeichnen und ihn so auf einen Blick
zu erkennen. Es beschreibt außerdem, wie ein PR leicht zu überprüfen ist. (Je einfacher ein PR zu überprüfen ist, desto
schneller wird er gemergt!)

Was macht einen guten PR aus?
---------------------

Code-Review und das Öffnen eines PR dienen zwei Zwecken:

1. Kugelblitz zu ändern - Aufgabe des Autors der Änderungen.
2. Sicherzustellen, dass die Änderungen im PR Kugelblitz verbessern - Aufgabe der PR-Reviewer.

### Arten von Änderungen

Die an Kugelblitz vorgenommenen Änderungen lassen sich in der Regel in drei Haupttypen unterteilen:

1. __Cleanup__: Diese lassen sich in drei Kategorien einteilen:

   1. Stilistische Änderungen, die den Code lesbarer und besser an den Rest der Codebasis anpassen.
   2. Refactoring-Änderungen, die den Code verbessern, indem sie Duplikate reduzieren oder Klassen und Abstraktionen
      bereinigen, die möglicherweise zu viele Verantwortlichkeiten hatten.
   3. Änderungen zum Hinzufügen oder Verbessern von Tests, um ungetestetes Verhalten abzudecken oder Tests
      übersichtlicher zu gestalten.

2. __Logical__: Dies sind Änderungen, die Funktionen und Möglichkeiten hinzufügen, die Kugelblitz bisher nicht hatte,
   oder möglicherweise die Funktionsweise bestehender Funktionen und Möglichkeiten verändern.

### Änderungen organisieren

Obwohl der Großteil der eingereichten Änderungen logische Änderungen sind, sind Bereinigungsänderungen sehr willkommen.
Beachten Sie jedoch einige kleine Richtlinien, um sicherzustellen, dass die Änderungen für PR-Prüfer leicht zu
überprüfen sind:

1. Die Änderungen sollten den Code gemäß den [Richtlinien für guten Stil](https://google.github.io/styleguide/javaguide.html)
   verbessern.
2. Die Änderungen sollten andere Änderungen, insbesondere logische Änderungen, nicht verdecken.

- Es ist besser, Bereinigungsänderungen als separaten PR oder zumindest als separate Commits von Commits mit logischen
  Änderungen zu erfassen. (Separate PRs werden dringend empfohlen.)
- Es ist besser, zu viele kleine Commits zusammenzufassen, als zu wenige große Commits mit
  überlappenden Änderungen. Kleine Commits lassen sich leichter zusammenfassen als große Commits.

### Änderungen dokumentieren

Manchmal sind die Änderungen und ihr Grund offensichtlich, oft ist jedoch unklar, was der Sinn der Änderung ist. Um es
den Prüfern zu erleichtern, die Änderungen und ihren Grund zu verstehen, beschreiben Sie die Änderungen bitte in der
PR-Beschreibung. Es ist auch ratsam, Ihre eigenen PRs zu überprüfen und Kommentare zu hinterlassen, wenn die Änderungen
zusätzliche Erläuterungen benötigen. Denken Sie daran: ___Es ist die Aufgabe des Autors, den Prüfern die Überprüfung der
Änderungen zu erleichtern!___

Phasen
------

Wenn ein PR vom Öffnen zum Zusammenführen oder Schließen übergeht, durchläuft er verschiedene Zustände bzw. Phasen, bis
er schließlich entweder geschlossen oder zusammengeführt wird.

- [Work in Progress (WIP)](#work-in-progress-wip)
- [Reviewable](#reviewable)
- [Mergeable](#mergeable)
- [Merged*](#merged)
- [Closed*](#closed)

<sub>* kennzeichnet integrierte GitHub-PR-Status.</sub>

### Work in Progress (WIP)

Der PR wird aktiv geändert, oft als Reaktion auf Feedback von Gutachtern oder um Feedback zu teilweisen Arbeiten zu
ermöglichen. Sie können ihn gerne überprüfen, der Code wird vom Autor jedoch noch nicht als vollständig angesehen und
muss wahrscheinlich erneut überprüft werden, sobald die laufenden Arbeiten abgeschlossen sind.

### Reviewable

Der Autor betrachtet die Änderungen als abgeschlossen und bereit zur vollständigen Überprüfung.

### Mergeable

Sobald ein PR diese Prüfungen bestanden hat, ist er zusammenführbar und kann [Merged*](#merged)
werden:

- Die Änderungen wurden von mindestens zwei Prüfern freigegeben.
- Die Änderungen basieren auf dem Head des „Master“-Branchs.
- Die Commits wurden in logische Commits zusammengefasst.

### Merged*

Der PR wurde zusammengeführt. Dies ist ein integrierter GitHub-PR-Status und sollte neben dem Status
[Zusammenführbar](#zusammengeführt) bestehen.

### Closed*

Die Änderungen werden nicht zusammengeführt, und der PR sollte keine weitere Aufmerksamkeit erhalten. Geschlossene PRs
können wieder geöffnet werden.

Ablauf
------

Obwohl es keine Einschränkungen für die Status gibt, da sie nur durch Labels gekennzeichnet sind, zeigt diese Tabelle
die erwarteten Statusübergänge von einer Phase zur nächsten.

| Start                                           | Ende                                                                                           |
|-------------------------------------------------|------------------------------------------------------------------------------------------------|
| -                                               | [Work in Progress (WIP)](#work-in-progress-wip), [Reviewable](#reviewable), [Closed*](#closed) |
| [Work in Progress (WIP)](#work-in-progress-wip) | [Reviewable](#reviewable), [Closed*](#closed)                                                  |
| [Reviewable](#reviewable)                       | [Work in Progress (WIP)](#work-in-progress-wip), [Mergeable](#mergeable), [Closed*](#closed)   |
| [Mergeable](#mergeable)                         | [Merged*](#merged), [Closed*](#closed)                                                         |
| [Merged*](#merged)                              | -                                                                                              |
| [Closed*](#closed)                              | [Work in Progress (WIP)](#work-in-progress-wip), [Reviewable](#reviewable)                     |

Flags
-----

Abhängig von den Änderungen, den Vorgängen im Repository außerhalb des PR und dem aktuellen Prozessstadium eines PR
können unterschiedliche Flags auf den PR angewendet werden. Einige Flags weisen auf Aspekte der Änderungen hin, während
andere Flags anzeigen, was mit den Commits oder Änderungen im PR geschehen muss, bevor er als
[Mergeable](#mergeable) betrachtet werden kann.

- [Breakfix](#breakfix)
- [Breaking Change](#breaking-change)
- [Need 2 Reviews](#need-2-reviews)
- [Need 1 Review](#need-1-review)
- [Need Changes](#need-changes)
- [Need Rebase](#need-rebase)
- [Need Squash](#need-squash)

### Breakfix

Die Änderungen im PR sind dringend erforderlich, um eine fehlerhafte Version zu beheben. Fehlerhafte Versionen sollten
so schnell wie möglich behoben werden. Daher sollten Fehlerbehebungs-PRs höhere Priorität erhalten als andere PRs.

### Breaking Change

Die Änderungen im PR sind nicht abwärtskompatibel mit kundenorientierten APIs. Diese APIs sind derzeit nicht
dokumentiert, werden aber hier verlinkt, sobald sie dokumentiert sind. Die Arbeitsliste der kundenorientierten APIs
umfasst derzeit:

- Antwortformate (inkl. Header)
- Anfrageformate (inkl. URLs, Abfrageparameter und Header)
- Konfiguration (inkl. Eigenschaftsnamen, Hilfsklassen und Schnittstellen)
- Datenbankabfragen (z. B. ArangoDB)

### Need 2 Reviews

Zwei weitere Genehmigungen sind erforderlich, bevor der PR als [Mergeable](#mergeable) eingestuft werden kann.

### Need 1 Review

Eine weitere Genehmigung ist erforderlich, bevor der PR als [Mergeable](#mergeable) eingestuft werden kann.

### Need Changes

Die Prüfer des PR sind der Ansicht, dass noch Änderungen vorgenommen werden müssen, bevor sie den PR genehmigen können.
Prüfer, die in einem Kommentar Änderungen anfordern, sollten sicherstellen, dass dieses Tag auf den PR angewendet wird.
Der Autor des PR sollte dieses Tag entfernen, sobald er der Meinung ist, alle erforderlichen Änderungen vorgenommen zu
haben.

### Need Rebase

Die Änderungen müssen auf den Head des „Master“-Branchs rebasiert werden, bevor der PR als [Mergeable](#mergeable)
betrachtet werden kann.

### Need Squash

Die Änderungen müssen in logische Commits zusammengefasst werden, bevor der PR als [Mergeable](#mergeable) betrachtet
werden kann.

**Hinweis: Ein PR, der nicht die erforderlichen zwei Genehmigungen erhalten hat, sollte nicht zusammengefasst werden.**
Alle Commits, die als Reaktion auf Review-Kommentare erstellt wurden, sollten bis zum Abschluss des Reviews im Branch
verbleiben, damit Reviewer die als Reaktion auf ihre Kommentare vorgenommenen Änderungen leicht verfolgen können.
