package org.example.module10;

import java.io.IOException;

public class EmptyFileException extends Exception {
    private String filePath;

    public EmptyFileException(String message, String filePath) {
        super(message);
        this.filePath = filePath;
    }

    public EmptyFileException(String message, IOException cause, String filePath) {
        super(message, cause);
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return getMessage() + filePath;
    }
}
