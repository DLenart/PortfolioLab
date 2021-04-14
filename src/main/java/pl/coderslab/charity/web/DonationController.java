package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;

@Controller
public class DonationController {

    private final DonationRepository donationRepository;
    private final InstitutionRepository institutionRepository;

    public DonationController(DonationRepository donationRepository, InstitutionRepository institutionRepository) {
        this.donationRepository = donationRepository;
        this.institutionRepository = institutionRepository;
    }
        @RequestMapping(value ="/admin/donation/add", method = RequestMethod.GET)
        public String addDonations(Model model){
            model.addAttribute("donation", new Donation());
            model.addAttribute("institutions", institutionRepository.findAll());
            return "donationAdd";
    }
        @RequestMapping(value ="/admin/donation/add", method = RequestMethod.POST)
        public String procesAddDonation(@ModelAttribute Donation donation){
            donationRepository.save(donation);
            return "donationAdd";
        }
}
