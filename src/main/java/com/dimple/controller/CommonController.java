package com.dimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: CommonController
 * @Description:
 * @Auther: Owenb
 * @Date: 11/20/18 10:39
 * @Version: 1.0
 */
@Controller
public class CommonController {

    @RequestMapping("/index")
    public String toIndex() {
        return "/index";
    }

    @RequestMapping("/to/{url}/{uri}")
    public String toURL(@PathVariable("url") String url, @PathVariable("uri") String uri) {
        return "/" + url + "/" + uri;
    }
}
