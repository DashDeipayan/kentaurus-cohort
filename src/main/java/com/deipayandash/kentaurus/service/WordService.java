package com.deipayandash.kentaurus.service;

import com.deipayandash.kentaurus.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {

	private Word WORD=new Word("");

	public String getWord(){
		return WORD.getWord();
	}

	public void setWord(String word){
		WORD.setWord(word);
	}
}
