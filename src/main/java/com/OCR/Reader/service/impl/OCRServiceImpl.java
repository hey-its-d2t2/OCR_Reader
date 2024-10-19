package com.OCR.Reader.service.impl;

import com.OCR.Reader.util.OCRProcessor;
import com.OCR.Reader.constants.AppConstants;
import com.OCR.Reader.pojo.OCRResult;
import com.OCR.Reader.service.OCRService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
@Slf4j
public class OCRServiceImpl implements OCRService {
    @Override
    public OCRResult processImage(MultipartFile file) {

        OCRResult result = new OCRResult();
        try {
            //Save file to a temp location

            File tempFile = File.createTempFile("ocr",".tmp");
            file.transferTo(tempFile);

            //Perform OCR
            OCRProcessor ocrProcessor = new OCRProcessor();
            String extractedText = ocrProcessor.extractTextFromImage(tempFile);

            // Clean up the temp file
            tempFile.delete();

            result.setExtractedText(extractedText);
            result.setStatus(AppConstants.SUCCESS);

        } catch (IOException e) {
           log.info("Error in processing image::"+e);
            result.setStatus(AppConstants.ERROR);
        }

        return result;
    }

    @Override
    public String searchInText(String extractedText, String keyword) {
        if (extractedText != null && keyword != null && !keyword.isEmpty()) {
            if (extractedText.contains(keyword)) {
                return "Keyword found!";
            } else {
                return "Keyword not found.";
            }
        }
        return "Invalid search input.";
    }

}
