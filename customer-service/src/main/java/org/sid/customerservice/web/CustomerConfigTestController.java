package org.sid.customerservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class CustomerConfigTestController {

    @Value("${globale.params.p1}")
    private String p1;

    @Value("${globale.params.p2}")
    private String p2;

    @Value("${customer.params.x}")
    private String x;

    @Value("${customer.params.y}")
    private String y;


    @GetMapping("/params")
    public Map<String,String> params(){
        Map<String,String> params = new HashMap<>();
        params.put("p1",p1);
        params.put("p2", p2);
        params.put("x", x);
        params.put("y",y);
        return params;
    }
}
