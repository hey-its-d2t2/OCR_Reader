# OCR and Document Search Web Application
The OCR and Document Search Web Application is designed to extract text from uploaded images using Optical Character Recognition (OCR) and provide a keyword-based search within the extracted text. This tool helps users quickly scan documents and search for specific information. This project leverages the Tesseract OCR engine to provide accurate text extraction capabilities, supporting multiple languages, including Hindi and English. The application is built to enhance image quality before processing, ensuring better recognition accuracy through DPI adjustments and format conversions.

### Features
- Upload images and extract text via OCR.
- Perform keyword-based search in the extracted text.
- Simple, user-friendly interface.
 -Copy extracted text to clipboard.
### Technologies Used
- Frontend: HTML, CSS (Bootstrap), JavaScript
- Backend: Java (Spring Boot), OCR Library (Tesseract)
- Libraries:
  - Tesseract for OCR.
  - Spring Boot for backend services.
  - Apache PDFBox for handling image files and adjusting DPI.
  - Lombok to reduce boilerplate code and improve readability.
  - SLF4J for logging purposes.
  - Thymeleaf for rendering frontend
### Prerequisites
Ensure you have the following installed:

Java 8 or higher
Maven (for dependency management)
Node.js (optional, for frontend development)
Tesseract OCR (Install locally for OCR functionality)
