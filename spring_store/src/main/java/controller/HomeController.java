/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author iapereira
 */
@Controller
@ComponentScan("repository.")
public class HomeController {

    @GetMapping("/")
    public ModelAndView index() {
        Map<String, Object> template = new HashMap();
        template.put("xValues", "[50,60,70,80,90,100,110,120,130,140,150];");
        return new ModelAndView("index", template);
    }
}
