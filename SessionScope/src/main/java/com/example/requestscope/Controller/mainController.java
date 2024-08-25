package com.example.requestscope.Controller;


import com.example.requestscope.Services.LoggedUserServiceManagament;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
    private final LoggedUserServiceManagament loggedUserServiceManagament;
    public  mainController(LoggedUserServiceManagament loggedUserServiceManagament){
            this.loggedUserServiceManagament=loggedUserServiceManagament;
    }
@GetMapping("/main")
    public String GetMainPage(@RequestParam(required = false) String logout, Model m){
        if(logout!=null){
            loggedUserServiceManagament.setUsername(null);
        }
        String username=loggedUserServiceManagament.getUsername();
        if(username==null){
            return "redirect:/";
        }
        m.addAttribute("username",username);
    return "mainpage.html";
}
}
