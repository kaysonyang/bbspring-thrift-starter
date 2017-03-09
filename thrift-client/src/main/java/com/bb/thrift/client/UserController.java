package com.bb.thrift.client;

import bb.spring.boot.thrift.client.annotation.ThriftClient;
import cloud.simple.interfaces.UserDto;
import cloud.simple.interfaces.UserService;
import org.apache.thrift.TException;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by bob on 17/1/11.
 */
@RestController
public class UserController {

    @ThriftClient(serviceId = "bbthriftserver", path = "/hello2")
    UserService.Client svr;


    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello() throws TException {
        UserDto userDto= svr.getUser();
        return Optional.ofNullable(userDto.getUsername())
                .map(name -> "hello "+name)
                .orElse(" hello kayson");
    }

}