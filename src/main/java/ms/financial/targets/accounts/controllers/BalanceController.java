package ms.financial.targets.accounts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class BalanceController {

    @GetMapping("/current")
    public String current() {
        return "Current";
    }

    @PostMapping("/create")
    public String create() {
        return "Create Current Balance";
    }
}
