package com.ailaysa.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ailaysa.service.IWordService;

/**
 * This class is responsible for handling incoming HTTP requests and delegating
 * the word count calculation to the associated WordService implementation.
 * 
 * @author safvan
 *
 */
@RestController
@RequestMapping("/api/word-count")
public class WordCountRestController {

	@Autowired
	private IWordService wordService;

	/**
	 * Get the word count of a given sentence.
	 *
	 * @param sentence The input sentence for which to count the words.
	 * @return The number of words in the sentence in JSON.
	 */
	@GetMapping("count-words/{sentence}")
	public ResponseEntity<Integer> getWordCount(@PathVariable String sentence) {

		Integer wordsCount = wordService.getCountOfWordsInSenetence(sentence);

		return ResponseEntity.ok().body(wordsCount);
	}
}
