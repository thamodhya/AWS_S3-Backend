package com.example.AWS_S3.repo;

import com.example.AWS_S3.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepo extends JpaRepository<File, Long> {
}
