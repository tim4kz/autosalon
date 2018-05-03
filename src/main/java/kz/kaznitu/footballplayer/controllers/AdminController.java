package kz.kaznitu.footballplayer.controllers;

import kz.kaznitu.footballplayer.models.Admin;
import kz.kaznitu.footballplayer.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public String adminList(Model model) {
        model.addAttribute("admins", adminRepository.findAll());
        model.addAttribute("admin", new Admin());
        return "admins";
    }

    @RequestMapping(value = "/saveadmin", method = RequestMethod.POST)
    public String saveAdmin(@ModelAttribute Admin admin) {
        adminRepository.save(admin);
        return "redirect:/admins";
    }

    @RequestMapping(value = "/remove1", method = RequestMethod.GET)
    public String remove1(@RequestParam("id") Long id){
        adminRepository.deleteById(id);
        return "redirect:/admins";
    }
}
