/*
    Generated by Atomist on 19 07 2016 
*/
package org.acolyer.atomist.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @RequestMapping(path = "/ping")
    public String ping() {
       return "pong";
    }
}