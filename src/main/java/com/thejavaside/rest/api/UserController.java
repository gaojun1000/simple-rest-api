package com.thejavaside.rest.api;

/**
 * Created by jgao on 3/1/16.
 */
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //the RequestBody annotation is important, otherwise springs won't deserialize the request body into the User object.
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public SuccessRestResult createUser(@RequestBody User user) {
        SuccessRestResult successRestResult = new SuccessRestResult();
        successRestResult.setMessage(user.getName() + " has been created successfully.");
        return successRestResult;
    }
}