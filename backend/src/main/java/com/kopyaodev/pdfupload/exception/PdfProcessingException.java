package com.kopyaodev.pdfupload.exception;

public class PdfProcessingException extends RuntimeException {
    public PdfProcessingException(String message) {
        super(message);
    }

    public PdfProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
} 