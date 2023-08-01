package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.User;
import model.UserWrapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConvocationController {
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    @GetMapping("/studentName")
    public UserWrapper getExample() throws JsonProcessingException {
        String jsonString = "{\n" +
                "    \"users\": [\n" +
                "        {\n" +
                "            \"email\": \"sodhana.reddy@humber.ca.ZZZZ\",\n" +
                "            \"name\": \"Sodhana Reddy\",\n" +
                "            \"address\": {\n" +
                "                \"line1\": \"205 Humber College Blvd\",\n" +
                "                \"line2\": \"\",\n" +
                "                \"city\": \"Toronto\",\n" +
                "                \"state\": \"ON\",\n" +
                "                \"zip\": \"M9W SL7\"\n" +
                "            },\n" +
                "            \"programs\": [{\n" +
                "                \"name\": \"Bachelor of Health Science (Workplace Health and Wellness)\",\n" +
                "                \"eligibility\": true,\n" +
                "                \"date\": \"June 2022\",\n" +
                "                \"attending\": true\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"Early Childhood Education\",\n" +
                "                \"eligibility\": false,\n" +
                "                \"date\": \"June 2022\",\n" +
                "                \"attending\": false\n" +
                "              }\n" +
                "            ]\n" +
                "\n" +
                "        }\n" +
                "    ],\n" +
                "\n" +
                "    \"control\": {\n" +
                "        \"active\": true\n" +
                "    }\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        UserWrapper userWrapper = objectMapper.readValue(jsonString, UserWrapper.class);

        return userWrapper;
    }
}
