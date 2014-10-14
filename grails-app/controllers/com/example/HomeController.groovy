package com.example

class HomeController {

    def sessionComponent

    def index() {
        [words: sessionComponent.getWords()]
    }

    def add() {
        if (params.word) {
            sessionComponent.addWord(params.word)
        }
        return redirect(action: 'index')
    }
}
