package com.OCR.Reader.service.impl;

import com.OCR.Reader.pojo.OCRResult;
import com.OCR.Reader.service.OCRService;
import org.springframework.web.multipart.MultipartFile;

public class OCRServiceImpl implements OCRService {
    @Override
    public OCRResult processImage(MultipartFile file) {
        return null;
    }

    @Override
    public String searchInText(String extractedText, String keyword) {
        return "";
    }
}
