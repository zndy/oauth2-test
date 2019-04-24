package my.test.oauth2.restcontroller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEndpoints {
//    @PreAuthorize("#oauth2.hasScope('select')")
    @GetMapping("/product/{id}")
    public String getProduct(@PathVariable String id){
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id: " + id;
    }

    @GetMapping("/order/{id}")
    public String getOrder(@PathVariable String id){
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id: " + id;
    }

    @GetMapping("/anonym/{id}")
    public String getStringWithoutPermission(@PathVariable String id){
        //for debug
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "anonym id: " + id;
    }
}
