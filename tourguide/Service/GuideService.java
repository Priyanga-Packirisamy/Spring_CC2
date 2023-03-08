package com.priyanga.tourguide.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.priyanga.tourguide.Entity.Guide;
import com.priyanga.tourguide.Repository.GuideRepo;

@Service
public class GuideService {
	@Autowired
	private GuideRepo gr;
	
	public void postdet(Guide g) {
		gr.save(g);
	}
	
	public List<Guide> getdet(){
		return gr.findAll();
	}
	
	public void deldet(int id) {
		gr.deleteById(id);
	}
	
	public void updatedet(Guide g) {
		gr.saveAndFlush(g);
	}
}
