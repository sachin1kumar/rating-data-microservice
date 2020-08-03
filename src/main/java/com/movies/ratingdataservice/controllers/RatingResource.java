package com.movies.ratingdataservice.controllers;

import com.movies.ratingdataservice.models.Rating;
import com.movies.ratingdataservice.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @Autowired
    private RatingRepository ratingRepository;

    @RequestMapping("/{movieid}")
    public Rating getRating(@PathVariable Long movieid){
        return ratingRepository.getOne(movieid);
    }
}
