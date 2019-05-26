package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import pac.TextEditor_injection_IoC_constructorbased_pac;

@SpringBootApplication
   @ComponentScan({"pac","com.example.demo"})

public class IoCApplication {
    
    //@Autowired
    //TextEditorDependent t4;
   // @Autowired
    //TextEditor_constructorBased_IoC t4;
    @Autowired
    TextEditor_injection_IoC_constructorbased t4;
     @Autowired
    TextEditor_injection_IoC_setterbased t5;
  
      @Autowired
     TextEditor_injection_IoC_constructorbased_pac t6;

	public static void main(String[] args) {
		SpringApplication.run(IoCApplication.class, args);
                TextEditorDependent t1=new TextEditorDependent();
                TextEditor_constructorBased_IoC t2=new TextEditor_constructorBased_IoC(new SpellChecker());
                TextEditor_setterbased_IoC t3=new TextEditor_setterbased_IoC();
                t3.setSpellChecker(new SpellChecker());
	}

}
