package com.rest.optional.stream.connector;

import com.rest.optional.stream.api.dto.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class GetUsersRestConnector {

    @Value("${get.posts.uri}")
    public String uri;
    @Autowired
    private RestTemplate restTemplate;

    public List<UserData> getAllUser() {

        return Collections.singletonList(new UserData());
    }

}
