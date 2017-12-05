package com.pongelupe.albunsSpotify.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pongelupe.albunsSpotify.model.Album;

@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer> {

}
