package com.recommendation.movie.controller;

import com.recommendation.movie.model.Movie;
import com.recommendation.movie.model.User;
import com.recommendation.movie.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;

    @PostMapping
    public Set<Movie> getRecommendations(@RequestBody User user) {
        return recommendationService.getRecommendations(user);
    }
}
