package pl.coderslab.charity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.repository.DonationRepository;
import pl.coderslab.charity.repository.InstitutionRepository;


@Controller
public class HomeController {
    private final InstitutionRepository institutionRepository;
    private final DonationRepository donationRepository;

    public HomeController(InstitutionRepository institutionRepository, DonationRepository donationRepository) {
        this.institutionRepository = institutionRepository;
        this.donationRepository = donationRepository;
    }


    @RequestMapping("/")
    public String homeAction(Model model){
        model.addAttribute("institutions", institutionRepository.findAll());
        model.addAttribute("totalsDonation",  donationRepository.selectTotalsDonation());
        model.addAttribute("totalsQuantity", donationRepository.selectTotalsQuantity());
        return "index";
    }





//    @RequestMapping("/")
//    public String list(Model model){
//        model.addAttribute("institutions", institutionRepository.findAll());
//        return "index";
//    }
}

