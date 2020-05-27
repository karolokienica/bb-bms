package okienica.karol.bbbms.controller;

import okienica.karol.bbbms.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

//    == fields ==
    private final DemoService demoService;

//    == contructors ==
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

//    == public methods ==
    @GetMapping("demo")
    public String demo(Model model){
        model.addAttribute("message", demoService.getMessage());
        return "demo/demo";
    }
}
