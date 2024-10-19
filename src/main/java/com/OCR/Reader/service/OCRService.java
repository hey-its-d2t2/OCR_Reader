package com.OCR.Reader.service;

import com.OCR.Reader.pojo.OCRResult;
import org.springframework.web.multipart.MultipartFile;

public interface OCRService {

    OCRResult processImage(MultipartFile file);
    String searchInText(String extractedText, String keyword);
}
