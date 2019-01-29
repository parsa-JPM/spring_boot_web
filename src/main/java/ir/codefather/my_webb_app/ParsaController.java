package ir.codefather.my_webb_app;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ParsaController {

    @RequestMapping("/welcome")
    public String welcome(HttpServletRequest request) {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        return "welcome";
    }
}
