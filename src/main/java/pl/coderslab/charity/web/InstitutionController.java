package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.domain.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
public class InstitutionController {
    private final InstitutionRepository institutionRepository;


    public InstitutionController(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }
    @RequestMapping(value ="/admin/institutions/add", method = RequestMethod.GET)
    public String addInstitution(Model model){
        model.addAttribute("institution", new Institution());
        return "institutionAdd";
    }
    @RequestMapping(value ="/admin/institutions/add", method = RequestMethod.POST)
    public String procesAddInstitution(@ModelAttribute Institution institution){
        institutionRepository.save(institution);
        return "institutionAdd";
    }


}
