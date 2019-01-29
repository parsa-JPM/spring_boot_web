package ir.codefather.my_webb_app;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParsaController {

    @RequestMapping("/welcome")
    public String welcome(HttpServletRequest request) {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        return "welcome";
    }

    /**
     * this method do above method job in spring style
     */
    @RequestMapping("/spring-welcome")
    public ModelAndView springWelcome(String name) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.setViewName("welcome");
        return mv;
    }
}
