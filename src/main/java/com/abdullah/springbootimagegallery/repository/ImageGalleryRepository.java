package com.abdullah.springbootimagegallery.repository;

import com.abdullah.springbootimagegallery.entity.ImageGallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long> {

}