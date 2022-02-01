package com.tba.editor.repository;

import com.tba.editor.entity.Room;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> { }
