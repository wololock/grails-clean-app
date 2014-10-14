package com.example

class SessionComponentService {

    private final HashMap<String, Integer> words = [:]

    public void addWord(String word) {
        synchronized (words) {
            if (words.containsKey(word)) {
                words.put(word, words.get(word) + 1)
            } else {
                words.put(word, 1)
            }
        }
    }

    public Map getWords() {
        return words.clone() as Map
    }
}
