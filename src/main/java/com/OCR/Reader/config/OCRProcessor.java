package com.OCR.Reader.config;

import com.OCR.Reader.constants.AppConstants;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

@Slf4j
public class OCRProcessor {
    public String extractTextFromImage(File imageFile) {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath(AppConstants.PATH); //path_to_tessdata_folder
        tesseract.setLanguage(AppConstants.LANGUAGE);  // Support both Hindi and English

        try {
            return tesseract.doOCR(imageFile);
        } catch (TesseractException e) {
            log.info("Exception in extraction"+e);
            return null;
        }
    }
}
