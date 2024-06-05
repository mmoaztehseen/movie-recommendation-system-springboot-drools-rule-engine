package com.recommendation.movie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    private int id;
    private String title;
    private String genre;
    private String description;
    private double rating;
    private String director;
    private int releaseYear;
}
