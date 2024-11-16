package com.example.AWS_S3.service.impl;

import org.springframework.web.multipart.MultipartFile;
import com.example.AWS_S3.entity.File;

import java.util.List;

public interface FileServiceImpl {

    File saveFile(MultipartFile file, String name);
    List<File> getAllFiles();
}
