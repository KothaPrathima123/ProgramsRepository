package com.pk.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/wishmsg")
public class WishMessageOperationsController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/info")
    public String getWishInfo() {
        List<ServiceInstance> list = client.getInstances("WishGeneratorService");
        
        if (list.isEmpty()) {
            
            return "No instances of WishGeneratorService available";
        }
        
        ServiceInstance si = list.get(0);
        String url = si.getUri() + "/wishMsg/details";
        RestTemplate template = new RestTemplate();
        String resp = template.getForObject(url, String.class);
        return resp;
    }
}
