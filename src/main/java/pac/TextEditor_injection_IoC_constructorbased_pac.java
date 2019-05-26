/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

import com.example.demo.SpellChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TextEditor_injection_IoC_constructorbased_pac {
    
    
    private SpellChecker spellChecker;
   
    @Autowired
   public TextEditor_injection_IoC_constructorbased_pac(SpellChecker spellChecker) {
      this.spellChecker = spellChecker;
   }
    
}
