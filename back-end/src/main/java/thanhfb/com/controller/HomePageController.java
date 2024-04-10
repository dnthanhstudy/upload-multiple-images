package thanhfb.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @GetMapping("/trang-chu")
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }
}
