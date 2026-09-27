package com.microservice2.firstjobapp.review.service;

import com.microservice2.firstjobapp.review.dao.Review;

import java.util.List;

public interface RevieService {

    List<Review> getAllReviews(Long companyId);
}
