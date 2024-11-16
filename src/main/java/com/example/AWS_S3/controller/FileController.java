package com.example.AWS_S3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.example.AWS_S3.service.FileService;
import com.example.AWS_S3.entity.File;
import java.util.List;

@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @PostMapping("/upload")
    public ResponseEntity<Object> saveFIle(@RequestParam(required = false) MultipartFile file,
                                           @RequestParam(required = false) String name){
        if (file.isEmpty() || name.isEmpty()){
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File and Name are required");
        }
        return ResponseEntity.ok(fileService.saveFile(file, name));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<File>> getAllFiles(){
        return ResponseEntity.ok(fileService.getAllFiles());
    }
}
