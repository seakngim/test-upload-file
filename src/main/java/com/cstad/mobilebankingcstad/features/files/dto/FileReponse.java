package com.cstad.mobilebankingcstad.features.dto;

public record FileReponse(String filename,
                          String fullUrl,
                          String downloadUrl,
                          String fileType,
                          float size
                          ) {
}
