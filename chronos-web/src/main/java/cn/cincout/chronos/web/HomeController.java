package cn.cincout.chronos.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaoyu on 18-2-21.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@RestController
public class HomeController {

    @GetMapping(value = "/user")
    public Map<String, Object> user() {
        Map<String, Object> user = new HashMap<>();
        user.put("name", "zhangzhaoyu");
        user.put("id", "001");
        return user;
    }
}
