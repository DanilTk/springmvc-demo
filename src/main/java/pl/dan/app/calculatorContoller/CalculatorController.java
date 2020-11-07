package pl.dan.app.calculatorContoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/show-calculator")
    public ModelAndView showCalculator() {
        CalculationParams calculationParams = new CalculationParams();
        ModelAndView modelAndView = new ModelAndView("calculator");
        modelAndView.addObject("calculatorParameters", calculationParams);

        return modelAndView;
    }

    @PostMapping("/calculate")
    public String calculateResult(@ModelAttribute("calculatorParameters") CalculationParams calculationParams) {
        int x = 5;
        calculationParams.getOperation();
        return "result";
    }
}
