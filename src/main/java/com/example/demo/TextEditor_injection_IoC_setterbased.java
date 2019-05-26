/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author eyvind
 */
@Component
public class TextEditor_injection_IoC_setterbased {
    
    private SpellChecker spellChecker;
   
    
   public TextEditor_injection_IoC_setterbased(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    //set metoden anropas ej om @Autowired tas bort!!
@Autowired
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
   
   
    
}
