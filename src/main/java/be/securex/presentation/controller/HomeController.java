package be.securex.presentation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


@Controller
public class HomeController {
    private final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model) {
        LOGGER.info("Entering showHomePage method");
        return "home";
    }

}
