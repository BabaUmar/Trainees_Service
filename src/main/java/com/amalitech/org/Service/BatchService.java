package com.amalitech.org.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amalitech.org.Entity.Batch;
import com.amalitech.org.Repository.BatchRepository;

@Service
public class BatchService {
	
	@Autowired
	private BatchRepository batchRepository;

	public List<Batch> getBatches() {
		return (List<Batch>) batchRepository.findAll();
	}
	
	public Batch getBatchById(Integer batchId) {
		return batchRepository.findById(batchId).get();
	}

	public Batch createBatch(Batch batch) {
		return batchRepository.save(batch);
	}
	public void deleteBatch(int id) {
		batchRepository.deleteById(id);
	}
	public Batch updateBatch(int id, Batch batch) {
		Batch batchFound = batchRepository.findById(id).orElseThrow();
		return batchRepository.save(batchFound);
	}

}
