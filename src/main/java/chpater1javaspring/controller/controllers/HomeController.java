package chpater1javaspring.controller.controllers;

import chpater1javaspring.controller.db.DBUtil;
import chpater1javaspring.controller.db.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model) {
        ArrayList<Item> items = DBUtil.getAllItems();
        model.addAttribute("items", items);
        return "index";
    }

}
