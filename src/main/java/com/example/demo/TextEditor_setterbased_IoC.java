/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

/**
 *
 * @author eyvind
 */
public class TextEditor_setterbased_IoC {
    
private SpellChecker spellChecker;
   
   public TextEditor_setterbased_IoC() {
     
   }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
   
   
}
