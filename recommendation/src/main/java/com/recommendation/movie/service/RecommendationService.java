package com.recommendation.movie.service;

import com.recommendation.movie.model.Movie;
import com.recommendation.movie.model.User;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecommendationService {

    @Autowired
    private KieContainer kieContainer;

    public Set<Movie> getRecommendations(User user) {
        Set<Movie> recommendations = new HashSet<>();
        KieSession kieSession = null;
        try {
            kieSession = kieContainer.newKieSession();
            kieSession.setGlobal("movies",recommendations);
            kieSession.insert(user);
            kieSession.fireAllRules();
        }finally {
            assert kieSession != null;
            kieSession.dispose();
        }
        return recommendations;
    }
}
