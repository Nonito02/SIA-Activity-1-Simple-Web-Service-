package com.nonitnotarte.activity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivityController {

    @GetMapping("/activity")
    public String getActivity(@RequestParam(value = "name", required = false) String name) {
        if (name == null || name.isEmpty()) {
            return "Hi Sir, here's my Activity";
        } else {
            return "Hi Sir, here's my Activity, and my name is Nonito T. Notarte II";
        }
    }
}
