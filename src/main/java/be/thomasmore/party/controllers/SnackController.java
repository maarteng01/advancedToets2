package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Snack;
import be.thomasmore.party.repositories.SnackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class SnackController {
    @Autowired
    private SnackRepository snackRepository;

    @GetMapping({"/snacklist", "/snacklist/{extrawoord}"})
    public String snacklist(Model model, @PathVariable(required = false) String extrawoord){
        Iterable<Snack> snacksFromDb = snackRepository.findAll();
        model.addAttribute("snacks", snacksFromDb);
        long nrOfSnacks = snackRepository.count();
        model.addAttribute("nrOfSnacks", nrOfSnacks);
        return "snacklist";
    }

    @GetMapping("/snackdetails/{id}")
    public String snackdetails(Model model, @PathVariable Integer id){
        if(id == null) return "snackdetails";

        Optional<Snack> snackFromDb = snackRepository.findById(id);
        if(snackFromDb.isPresent()) {
            model.addAttribute("snack", snackFromDb);
        }
        return "snackdetails";
    }
}
