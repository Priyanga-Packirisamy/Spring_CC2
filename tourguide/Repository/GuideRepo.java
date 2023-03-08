package com.priyanga.tourguide.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyanga.tourguide.Entity.Guide;

public interface GuideRepo extends JpaRepository<Guide, Integer> {

}
