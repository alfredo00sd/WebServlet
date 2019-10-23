package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.Museum;
import models.User;

import java.util.List;

public class TransformToJson {

    public static String toJson(List<User> user) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
    }


    public static String museumToJson(List<Museum> museum) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(museum);
    }
}
