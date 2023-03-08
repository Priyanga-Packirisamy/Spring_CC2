package com.priyanga.tourguide.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.priyanga.tourguide.Entity.Guide;
import com.priyanga.tourguide.Service.GuideService;
@CrossOrigin("http://localhost:3000")
@RestController
public class GuideController {
	
	@Autowired
	private GuideService gs;
	
	@PostMapping("/post")
	public String postdet(@RequestBody Guide g) {
		gs.postdet(g);
		return "Added Succesfully";
	}
	
	@GetMapping("/get")
	public List<Guide> getDet(){
		return gs.getdet();
	}
	
	@PutMapping("/put")
	public String updateDet(@RequestBody Guide g) {
		gs.updatedet(g);
		return "Updated Successfully";
	}
	
	@DeleteMapping("/del/{id}")
	public String delDet(@PathVariable("id") int id) {
		gs.deldet(id);
		return "Deleted Successfully";
	}
}
