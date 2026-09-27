package com.microservice2.firstjobapp.review.service;

import com.microservice2.firstjobapp.review.dao.Review;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewServiceImpl implements RevieService{
    @Override
    public List<Review> getAllReviews(Long companyId) {
        return List.of();
    }
}
