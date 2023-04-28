package com.deipayandash.kentaurus.controller;

import com.deipayandash.kentaurus.model.Word;
import com.deipayandash.kentaurus.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/words")
@CrossOrigin("*")
public class WordController {

	@Autowired
	WordService wordService;

	@GetMapping("/")
    public ResponseEntity<Word> getLastWord(){
		return new ResponseEntity<>(new Word(wordService.getWord()), HttpStatus.OK);
	}

	@PutMapping("/{word}")
	public ResponseEntity<String> setLastWord(@PathVariable String word){
		wordService.setWord(word);
		return new ResponseEntity<>("Word added Successfully:"+word, HttpStatus.OK);
	}
}
