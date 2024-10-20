package com.OCR.Reader.controller;

import com.OCR.Reader.pojo.OCRResult;
import com.OCR.Reader.service.OCRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/ocr")
public class OCRController {

    @Autowired
    private OCRService ocrService;

    // Endpoint for image upload and OCR processing
    @PostMapping("/upload")
    public OCRResult handleFileUpload(@RequestParam("imageFile") MultipartFile imageFile) {
        return ocrService.processImage(imageFile);
    }

    // Endpoint for searching a keyword in extracted text
    @PostMapping("/search")
    public String searchInText(@RequestParam("keyword") String keyword, @RequestParam("extractedText") String extractedText) {
        return ocrService.searchInText(extractedText, keyword);
    }
}
