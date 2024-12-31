package com.netflix.monolithi.service;

import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    public String getRecommendations(String userId) {
        // Simulating movie recommendations based on userId
        return "Recommended movies for " + userId + ": Movie A, Movie B, Movie C";
    }
}