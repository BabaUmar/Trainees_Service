package com.amalitech.org.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amalitech.org.Entity.Track;
@Repository
public interface TrackRepository extends JpaRepository<Track, Integer>{
	
//	@Query(value="SELECT * FROM track t WHERE t.id IN (SELECT track_id FROM trainee_tracks)", nativeQuery=true)
//	List<Track> getTracksWithTrainee();
}
