package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.charity.domain.Donation;
import pl.coderslab.charity.domain.User;
import pl.coderslab.charity.repository.UserRepository;

@Controller
public class RegisterController {
    private final UserRepository userRepository;

    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value ="/register", method = RequestMethod.GET)
    public String register(Model model) {
        model.addAttribute("user",new User());
        return "register";
    }

    @RequestMapping(value ="/register", method = RequestMethod.POST)
    public String procesRegister(@ModelAttribute User user, @RequestParam String password2, Model model){
        if(user.getPassword().equals(password2)) {
            userRepository.save(user);
        }
        return "login";
    }

}
