package com.example.demo;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Hello {

    //localhost:8080/hello?name=<name>
    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("time", new java.util.Date().toString());
        return "index";                                         //index.html is returned
    }

    /*
    localhost:8080/person/new
    presents to the user the person_form page to fill-out
     */
    @GetMapping("/person/new")
    public String createPerson(Model model){
        Person person = new Person();                            //blank person object
        model.addAttribute("person", person);      //keyvalue = person
        return "person_form";                                   //person_form.html is returned
    }

    /*
    localhost:8080/person_show is the output returned after user fills out person_form.html
    Params:
    person = thymelead validate Person person form data and load it into a person object
    result = the result of the validation will be the BindingResult
    model = model for any data going back to the browser
    */
    @PostMapping("/person")                                     //person = url from person_form.html
    public String processPersonForm(@Valid Person person, BindingResult result, Model model){
        if (result.hasErrors()){                                //check for errors
            return "person_form";                               //if errors return the form to the user
        }
        return "person_show";                                   //no errors return person_show.html
    }
}
