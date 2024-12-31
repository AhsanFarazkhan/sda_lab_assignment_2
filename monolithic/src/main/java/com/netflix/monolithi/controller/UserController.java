package com.netflix.monolithi.controller;

import com.netflix.monolithi.model.User;
import com.netflix.monolithi.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private RecommendationService recommendationService;

    @GetMapping("/user/{id}")
    public String getUserWithRecommendations(@PathVariable("id") String userId) {
        // Simulating fetching user data
        User user = new User(userId, "John Doe", "john.doe@example.com");

        // Fetch movie recommendations from RecommendationService
        String recommendations = recommendationService.getRecommendations(userId);

        return "User Info: " + user.getName() + ", " + user.getEmail() + " | " + recommendations;
    }
}