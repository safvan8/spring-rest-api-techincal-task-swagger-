package com.ailaysa.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {

	private LocalDateTime dateTime;
	private String message;
	private String status;
	private String path;
}
