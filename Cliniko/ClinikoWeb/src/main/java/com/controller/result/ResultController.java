package com.controller.result;

/**
 * Created by ss on 01-10-2017.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResultController {
    @RequestMapping("/result")
    public String showResult() {
        return "result";
    }
}
