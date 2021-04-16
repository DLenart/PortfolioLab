package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.repository.CategoryRepository;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DonationController {

    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;
    private final CategoryRepository categoryRepository;


    public DonationController(DonationRepository donationRepository, InstitutionRepository institutionRepository, CategoryRepository categoryRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
        this.categoryRepository = categoryRepository;
    }

        @RequestMapping(value ="/form", method = RequestMethod.GET)
        public String addDonations(Model model){
            model.addAttribute("donation", new Donation());
            model.addAttribute("institutions", institutionRepository.findAll());
            model.addAttribute("categories", categoryRepository.findAll());
            return "form";
    }
        @RequestMapping(value ="/form", method = RequestMethod.POST)
        public String procesAddDonation(@ModelAttribute Donation donation){
            donationRepository.save(donation);
            return "formConfirmation";
        }
}
