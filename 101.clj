; hello world
(defn salve
  "Writes Fala tu, <> to *out*"
  [fulanx] (str "Fala tu, " fulanx))

; set syntax:
; #{}

; to load file use:
; (load-file "file-name")
; to load this very file, use:
; (load-file "101.clj")


; conj = short for conjoin
; conj builds a new collection with an item added
; example: creating a set collection with a Formula 1 team: 
(conj #{} "Mercedes AMG F1 Team")

; reference types = refs

; def is like defn, but more general (both functions and data)
; not working
;(def symbol initial-state?)

; using atom to create an atom, and
; using def to bind the atom to the name visitors
(def visitors (atom #{}))

; to update a reference, one must use a function, such as swap!: 
(swap! visitors conj "Mercedes" "Ferrari" "F1")

; peeking inside a reference 
(deref visitors)

@visitors

(salve "Lucas")
(salve "Xpto")
(defn ola
  "Oi"
  [pessoa]
  (swap! visitors conj pessoa)
  (str "Fala comigo, " pessoa))

(ola "Xavier")
(ola "Ferreira")
(ola "Lucas")

@visitors

(doc ola)
;user/ola
; ([pessoa])
;   Oi
;nil