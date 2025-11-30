package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "Mapping /sbb에 대한 응답으로 ResponseBody가 붙은 문자열을 클라이언트에게 전달합니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}