package com.amalitech.org.api;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amalitech.org.Entity.Batch;
import com.amalitech.org.Service.BatchService;
import com.amalitech.org.dto.BatchDTO;

@RestController
@RequestMapping("/api")
public class BatchController {
	
	
	@Autowired
	private BatchService batchService;
	@Autowired
	private ModelMapper modelmapper;
	

	@GetMapping("/batches")
	public List<Batch> getBatches() {
		return batchService.getBatches();
	}
	
	@GetMapping("/batch/{id}")
	public Batch getBatchById(@PathVariable(name="id") Integer batchId) {
		return batchService.getBatchById(batchId);
	}
	
	@PostMapping("/batch")
	public Batch createBatch(@RequestBody Batch batch){
		return batchService.createBatch(batch);
	}
	
	@DeleteMapping("/batch/{id}")
	public String deleteBatch(@PathVariable(name="id") Integer batchId) {
		
		batchService.deleteBatch(batchId);
		
		return "Batch successfully deleted";
	}
	@PutMapping("/batch/{id}")
	public Batch updateBatch(@PathVariable(name = "id") Integer id, @RequestBody BatchDTO batchDTO) {
		Batch batch = modelmapper.map(batchDTO, Batch.class);
		batch.setId(id);

		return batchService.updateBatch(id, batch);
	}


}
